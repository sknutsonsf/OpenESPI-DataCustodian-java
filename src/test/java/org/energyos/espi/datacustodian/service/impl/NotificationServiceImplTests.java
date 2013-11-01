/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.energyos.espi.datacustodian.service.impl;


import org.energyos.espi.datacustodian.BaseTest;
import org.energyos.espi.datacustodian.domain.BatchList;
import org.energyos.espi.datacustodian.domain.Subscription;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.web.client.RestTemplate;

import static org.energyos.espi.datacustodian.utils.factories.EspiFactory.newSubscription;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class NotificationServiceImplTests extends BaseTest {

    @Mock
    public UpdateServiceImpl updateService;

    @Mock
    public RestTemplate template;

    public NotificationServiceImpl service;

    @Before
    public void setup() {
        service = new NotificationServiceImpl();
        service.setUpdateService(updateService);
        service.setRestTemplate(template);
    }

    @Test
    public void notify_notifiesThirdParty() {
        Subscription subscription = newSubscription();
        BatchList batchList = new BatchList();
        when(updateService.updatedResources(subscription)).thenReturn(batchList);

        service.notify(subscription);

        verify(template).postForLocation(subscription.getThirdParty().getNotificationURI(), batchList);
    }
}
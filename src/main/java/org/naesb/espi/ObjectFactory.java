//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 10:21:34 AM EDT 
//


package org.naesb.espi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.naesb.espi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IntervalReading_QNAME = new QName("http://naesb.org/espi", "IntervalReading");
    private final static QName _IntervalBlock_QNAME = new QName("http://naesb.org/espi", "IntervalBlock");
    private final static QName _Object_QNAME = new QName("http://naesb.org/espi", "Object");
    private final static QName _ReadingType_QNAME = new QName("http://naesb.org/espi", "ReadingType");
    private final static QName _SummaryMeasurement_QNAME = new QName("http://naesb.org/espi", "SummaryMeasurement");
    private final static QName _Authorization_QNAME = new QName("http://naesb.org/espi", "Authorization");
    private final static QName _ElectricPowerQualitySummary_QNAME = new QName("http://naesb.org/espi", "ElectricPowerQualitySummary");
    private final static QName _ReadingQuality_QNAME = new QName("http://naesb.org/espi", "ReadingQuality");
    private final static QName _Subscription_QNAME = new QName("http://naesb.org/espi", "Subscription");
    private final static QName _LocalTimeParameters_QNAME = new QName("http://naesb.org/espi", "LocalTimeParameters");
    private final static QName _ApplicationInformation_QNAME = new QName("http://naesb.org/espi", "ApplicationInformation");
    private final static QName _DateTimeInterval_QNAME = new QName("http://naesb.org/espi", "DateTimeInterval");
    private final static QName _ServiceStatus_QNAME = new QName("http://naesb.org/espi", "ServiceStatus");
    private final static QName _IdentifiedObject_QNAME = new QName("http://naesb.org/espi", "IdentifiedObject");
    private final static QName _MeterReading_QNAME = new QName("http://naesb.org/espi", "MeterReading");
    private final static QName _UsagePoint_QNAME = new QName("http://naesb.org/espi", "UsagePoint");
    private final static QName _BatchItemInfo_QNAME = new QName("http://naesb.org/espi", "BatchItemInfo");
    private final static QName _ElectricPowerUsageSummary_QNAME = new QName("http://naesb.org/espi", "ElectricPowerUsageSummary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.naesb.espi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeterReading }
     * 
     */
    public MeterReading createMeterReading() {
        return new MeterReading();
    }

    /**
     * Create an instance of {@link UsagePoint }
     * 
     */
    public UsagePoint createUsagePoint() {
        return new UsagePoint();
    }

    /**
     * Create an instance of {@link BatchItemInfo }
     * 
     */
    public BatchItemInfo createBatchItemInfo() {
        return new BatchItemInfo();
    }

    /**
     * Create an instance of {@link ElectricPowerUsageSummary }
     * 
     */
    public ElectricPowerUsageSummary createElectricPowerUsageSummary() {
        return new ElectricPowerUsageSummary();
    }

    /**
     * Create an instance of {@link TimeConfiguration }
     * 
     */
    public TimeConfiguration createTimeConfiguration() {
        return new TimeConfiguration();
    }

    /**
     * Create an instance of {@link ApplicationInformation }
     * 
     */
    public ApplicationInformation createApplicationInformation() {
        return new ApplicationInformation();
    }

    /**
     * Create an instance of {@link DateTimeInterval }
     * 
     */
    public DateTimeInterval createDateTimeInterval() {
        return new DateTimeInterval();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link IdentifiedObject }
     * 
     */
    public IdentifiedObject createIdentifiedObject() {
        return new IdentifiedObject();
    }

    /**
     * Create an instance of {@link SummaryMeasurement }
     * 
     */
    public SummaryMeasurement createSummaryMeasurement() {
        return new SummaryMeasurement();
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link ReadingQuality }
     * 
     */
    public ReadingQuality createReadingQuality() {
        return new ReadingQuality();
    }

    /**
     * Create an instance of {@link ElectricPowerQualitySummary }
     * 
     */
    public ElectricPowerQualitySummary createElectricPowerQualitySummary() {
        return new ElectricPowerQualitySummary();
    }

    /**
     * Create an instance of {@link IntervalReading }
     * 
     */
    public IntervalReading createIntervalReading() {
        return new IntervalReading();
    }

    /**
     * Create an instance of {@link Object }
     * 
     */
    public Object createObject() {
        return new Object();
    }

    /**
     * Create an instance of {@link IntervalBlock }
     * 
     */
    public IntervalBlock createIntervalBlock() {
        return new IntervalBlock();
    }

    /**
     * Create an instance of {@link ReadingType }
     * 
     */
    public ReadingType createReadingType() {
        return new ReadingType();
    }

    /**
     * Create an instance of {@link RationalNumber }
     * 
     */
    public RationalNumber createRationalNumber() {
        return new RationalNumber();
    }

    /**
     * Create an instance of {@link ServiceCategory }
     * 
     */
    public ServiceCategory createServiceCategory() {
        return new ServiceCategory();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link ReadingInterharmonic }
     * 
     */
    public ReadingInterharmonic createReadingInterharmonic() {
        return new ReadingInterharmonic();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntervalReading }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "IntervalReading")
    public JAXBElement<IntervalReading> createIntervalReading(IntervalReading value) {
        return new JAXBElement<IntervalReading>(_IntervalReading_QNAME, IntervalReading.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntervalBlock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "IntervalBlock")
    public JAXBElement<IntervalBlock> createIntervalBlock(IntervalBlock value) {
        return new JAXBElement<IntervalBlock>(_IntervalBlock_QNAME, IntervalBlock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "Object")
    public JAXBElement<Object> createObject(Object value) {
        return new JAXBElement<Object>(_Object_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "ReadingType")
    public JAXBElement<ReadingType> createReadingType(ReadingType value) {
        return new JAXBElement<ReadingType>(_ReadingType_QNAME, ReadingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "SummaryMeasurement")
    public JAXBElement<SummaryMeasurement> createSummaryMeasurement(SummaryMeasurement value) {
        return new JAXBElement<SummaryMeasurement>(_SummaryMeasurement_QNAME, SummaryMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authorization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "Authorization")
    public JAXBElement<Authorization> createAuthorization(Authorization value) {
        return new JAXBElement<Authorization>(_Authorization_QNAME, Authorization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricPowerQualitySummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "ElectricPowerQualitySummary")
    public JAXBElement<ElectricPowerQualitySummary> createElectricPowerQualitySummary(ElectricPowerQualitySummary value) {
        return new JAXBElement<ElectricPowerQualitySummary>(_ElectricPowerQualitySummary_QNAME, ElectricPowerQualitySummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadingQuality }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "ReadingQuality")
    public JAXBElement<ReadingQuality> createReadingQuality(ReadingQuality value) {
        return new JAXBElement<ReadingQuality>(_ReadingQuality_QNAME, ReadingQuality.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "Subscription")
    public JAXBElement<Subscription> createSubscription(Subscription value) {
        return new JAXBElement<Subscription>(_Subscription_QNAME, Subscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "LocalTimeParameters")
    public JAXBElement<TimeConfiguration> createLocalTimeParameters(TimeConfiguration value) {
        return new JAXBElement<TimeConfiguration>(_LocalTimeParameters_QNAME, TimeConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "ApplicationInformation")
    public JAXBElement<ApplicationInformation> createApplicationInformation(ApplicationInformation value) {
        return new JAXBElement<ApplicationInformation>(_ApplicationInformation_QNAME, ApplicationInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeInterval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "DateTimeInterval")
    public JAXBElement<DateTimeInterval> createDateTimeInterval(DateTimeInterval value) {
        return new JAXBElement<DateTimeInterval>(_DateTimeInterval_QNAME, DateTimeInterval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "ServiceStatus")
    public JAXBElement<ServiceStatus> createServiceStatus(ServiceStatus value) {
        return new JAXBElement<ServiceStatus>(_ServiceStatus_QNAME, ServiceStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifiedObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "IdentifiedObject")
    public JAXBElement<IdentifiedObject> createIdentifiedObject(IdentifiedObject value) {
        return new JAXBElement<IdentifiedObject>(_IdentifiedObject_QNAME, IdentifiedObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReading }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "MeterReading")
    public JAXBElement<MeterReading> createMeterReading(MeterReading value) {
        return new JAXBElement<MeterReading>(_MeterReading_QNAME, MeterReading.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsagePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "UsagePoint")
    public JAXBElement<UsagePoint> createUsagePoint(UsagePoint value) {
        return new JAXBElement<UsagePoint>(_UsagePoint_QNAME, UsagePoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchItemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "BatchItemInfo")
    public JAXBElement<BatchItemInfo> createBatchItemInfo(BatchItemInfo value) {
        return new JAXBElement<BatchItemInfo>(_BatchItemInfo_QNAME, BatchItemInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricPowerUsageSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://naesb.org/espi", name = "ElectricPowerUsageSummary")
    public JAXBElement<ElectricPowerUsageSummary> createElectricPowerUsageSummary(ElectricPowerUsageSummary value) {
        return new JAXBElement<ElectricPowerUsageSummary>(_ElectricPowerUsageSummary_QNAME, ElectricPowerUsageSummary.class, null, value);
    }

}

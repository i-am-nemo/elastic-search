package com.oracle.ms.elastic.model;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "asset-poc")
public class ICSAssetRequestDTO {

	
	  @Id
	  private Long assetId;
	
	  @Field(type = FieldType.Date, name = "activeEndDate")
	  private Instant activeEndDate;
	  
	  @Field(type = FieldType.Date, name = "activeStartDate")
	  private Instant activeStartDate;
	 
	  @Field(type = FieldType.Text, name = "assetDescription")
	  private String assetDescription;
	 
	  @Field(type = FieldType.Text, name = "assetNumber")
	  private String assetNumber;
	 
	  @Field(type = FieldType.Text, name = "assetTag")
	  private String assetTag;
	 
	  @Field(type = FieldType.Text, name = "currentLocationContext")
	  private String currentLocationContext;
	 
	  @Field(type = FieldType.Long, name = "currentLocationId")
	  private Long currentLocationId;
	 
	  @Field(type = FieldType.Long, name = "customerAccountId")
	  private Long customerAccountId;
	 
	  @Field(type = FieldType.Long, name = "customerAccountSiteId")
	  private Long customerAccountSiteId;
	 
	  @Field(type = FieldType.Long, name = "customerAccountSiteUseId")
	  private Long customerAccountSiteUseId;
	 
	  @Field(type = FieldType.Date, name = "customerAssetEndDate")
	  private Instant customerAssetEndDate;
	 
	  @Field(type = FieldType.Date, name = "customerAssetStartDate")
	  private Instant customerAssetStartDate;
	 
	  @Field(type = FieldType.Long, name = "customerBillingPartyId")
	  private Long customerBillingPartyId;
	 
	  @Field(type = FieldType.Long, name = "customerBillingPartySiteId")
	  private Long customerBillingPartySiteId;
	 
	  @Field(type = FieldType.Long, name = "customerId")
	  private Long customerId;
	 
	  @Field(type = FieldType.Long, name = "customerSiteId")
	  private Long customerSiteId;
	 
	  @Field(type = FieldType.Long, name = "customerSitePartyId")
	  private Long customerSitePartyId;
	 
	  @Field(type = FieldType.Text, name = "dfltWoSubType")
	  private String dfltWoSubType;
	 
	  @Field(type = FieldType.Text, name = "dfltWoType")
	  private String dfltWoType;
	 
	  @Field(type = FieldType.Long, name = "genObjectId")
	  private Long genObjectId;
	 
	  @Field(type = FieldType.Date, name = "inServiceDate")
	  private Instant inServiceDate;
	 
	  @Field(type = FieldType.Date, name = "installedDate")
	  private Instant installedDate;
	 
	  @Field(type = FieldType.Text, name = "installedLocationContext")
	  private String installedLocationContext;
	 
	  @Field(type = FieldType.Long, name = "installedLocationId")
	  private Long installedLocationId;
	 
	  @Field(type = FieldType.Long, name = "invLocatorId")
	  private Long invLocatorId;
	 
	  @Field(type = FieldType.Long, name = "itemId")
	  private Long itemId;
	 
	  @Field(type = FieldType.Long, name = "itemOrganizationId")
	  private Long itemOrganizationId;
	 
	  @Field(type = FieldType.Text, name = "itemRevision")
	  private String itemRevision;
	 
	  @Field(type = FieldType.Long, name = "locationOrganizationId")
	  private Long locationOrganizationId;
	 
	  @Field(type = FieldType.Boolean, name = "logicalFlag")
	  private Boolean logicalFlag;
	 
	  @Field(type = FieldType.Text, name = "locationTypeCode")
	  private String locationTypeCode;
	 
	  @Field(type = FieldType.Text, name = "lotNumber")
	  private String lotNumber;
	 
	  @Field(type = FieldType.Boolean, name = "maintainableFlag")
	  private Boolean maintainableFlag;
	 
	  @Field(type = FieldType.Boolean, name = "newWoAllowedFlag")
	  private Boolean newWoAllowedFlag;
	 
	  @Field(type = FieldType.Integer, name = "objectVersionNumber")
	  private Integer objectVersionNumber;
	 
	  @Field(type = FieldType.Text, name = "orderItemType")
	  private String orderItemType;
	 
	  @Field(type = FieldType.Date, name = "originationDate")
	  private Instant originationDate;
	 
	  @Field(type = FieldType.Text, name = "ownedBy")
	  private String ownedBy;
	 
	  @Field(type = FieldType.Long, name = "parentAssetId")
	  private Long parentAssetId;
	 
	  @Field(type = FieldType.Text, name = "parentOrderLineId")
	  private String parentOrderLineId;
	 
	  @Field(type = FieldType.Text, name = "parentOrderLineNumber")
	  private String parentOrderLineNumber;
	 
	  @Field(type = FieldType.Boolean, name = "partiallyFinishedFlag")
	  private Boolean partiallyFinishedFlag;
	 
	  @Field(type = FieldType.Date, name = "purchaseDate")
	  private Instant purchaseDate;
	 
	  @Field(type = FieldType.Long, name = "quantity")
	  private Long quantity;
	 
	  @Field(type = FieldType.Boolean, name = "registeredFlag")
	  private Boolean registeredFlag;
	 
	  @Field(type = FieldType.Text, name = "rmaFulfillLineId")
	  private String rmaFulfillLineId;
	 
	  @Field(type = FieldType.Text, name = "rmaHeaderId")
	  private String rmaHeaderId;
	 
	  @Field(type = FieldType.Text, name = "rmaLineId")
	  private String rmaLineId;
	 
	  @Field(type = FieldType.Long, name = "salesOrderFulfillLineId")
	  private Long salesOrderFulfillLineId;
	 
	  @Field(type = FieldType.Long, name = "salesOrderHeaderId")
	  private Long salesOrderHeaderId;
	 
	  @Field(type = FieldType.Long, name = "salesOrderLineId")
	  private Long salesOrderLineId;
	 
	  @Field(type = FieldType.Text, name = "salesOrderLineNumber")
	  private String salesOrderLineNumber;
	 
	  @Field(type = FieldType.Text, name = "salesOrderNumber")
	  private String salesOrderNumber;
	 
	  @Field(type = FieldType.Text, name = "salesOrderSourceSystem")
	  private String salesOrderSourceSystem;
	 
	  @Field(type = FieldType.Text, name = "salesOrderSourceSystemType")
	  private String salesOrderSourceSystemType;
	 
	  @Field(type = FieldType.Text, name = "serialNumber")
	  private String serialNumber;
	 
	  @Field(type = FieldType.Date, name = "shipmentDate")
	  private Instant shipmentDate;
	 
	  @Field(type = FieldType.Long, name = "soldByBusinessUnitId")
	  private Long soldByBusinessUnitId;
	 
	  @Field(type = FieldType.Text, name = "statusCode")
	  private String statusCode;
	 
	  @Field(type = FieldType.Text, name = "subinventoryCode")
	  private String subinventoryCode;
	 
	  @Field(type = FieldType.Long, name = "supplierId")
	  private Long supplierId;
	 
	  @Field(type = FieldType.Long, name = "supplierSiteId")
	  private Long supplierSiteId;
	 
	  @Field(type = FieldType.Text, name = "uomCode")
	  private String uomCode;
	 
	  @Field(type = FieldType.Boolean, name = "unassignedFlag")
	  private Boolean unassignedFlag;
	 
	  @Field(type = FieldType.Text, name = "usedBy")
	  private String usedBy;
	 
	  @Field(type = FieldType.Long, name = "workCenterId")
	  private Long workCenterId;
	 
	  @Field(type = FieldType.Long, name = "workOrderId")
	  private Long workOrderId;
	 
	  @Field(type = FieldType.Long, name = "workOrderOperationId")
	  private Long workOrderOperationId;

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public Instant getActiveEndDate() {
		return activeEndDate;
	}

	public void setActiveEndDate(Instant activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	public Instant getActiveStartDate() {
		return activeStartDate;
	}

	public void setActiveStartDate(Instant activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	public String getAssetDescription() {
		return assetDescription;
	}

	public void setAssetDescription(String assetDescription) {
		this.assetDescription = assetDescription;
	}

	public String getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getAssetTag() {
		return assetTag;
	}

	public void setAssetTag(String assetTag) {
		this.assetTag = assetTag;
	}

	public String getCurrentLocationContext() {
		return currentLocationContext;
	}

	public void setCurrentLocationContext(String currentLocationContext) {
		this.currentLocationContext = currentLocationContext;
	}

	public Long getCurrentLocationId() {
		return currentLocationId;
	}

	public void setCurrentLocationId(Long currentLocationId) {
		this.currentLocationId = currentLocationId;
	}

	public Long getCustomerAccountId() {
		return customerAccountId;
	}

	public void setCustomerAccountId(Long customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	public Long getCustomerAccountSiteId() {
		return customerAccountSiteId;
	}

	public void setCustomerAccountSiteId(Long customerAccountSiteId) {
		this.customerAccountSiteId = customerAccountSiteId;
	}

	public Long getCustomerAccountSiteUseId() {
		return customerAccountSiteUseId;
	}

	public void setCustomerAccountSiteUseId(Long customerAccountSiteUseId) {
		this.customerAccountSiteUseId = customerAccountSiteUseId;
	}

	public Instant getCustomerAssetEndDate() {
		return customerAssetEndDate;
	}

	public void setCustomerAssetEndDate(Instant customerAssetEndDate) {
		this.customerAssetEndDate = customerAssetEndDate;
	}

	public Instant getCustomerAssetStartDate() {
		return customerAssetStartDate;
	}

	public void setCustomerAssetStartDate(Instant customerAssetStartDate) {
		this.customerAssetStartDate = customerAssetStartDate;
	}

	public Long getCustomerBillingPartyId() {
		return customerBillingPartyId;
	}

	public void setCustomerBillingPartyId(Long customerBillingPartyId) {
		this.customerBillingPartyId = customerBillingPartyId;
	}

	public Long getCustomerBillingPartySiteId() {
		return customerBillingPartySiteId;
	}

	public void setCustomerBillingPartySiteId(Long customerBillingPartySiteId) {
		this.customerBillingPartySiteId = customerBillingPartySiteId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCustomerSiteId() {
		return customerSiteId;
	}

	public void setCustomerSiteId(Long customerSiteId) {
		this.customerSiteId = customerSiteId;
	}

	public Long getCustomerSitePartyId() {
		return customerSitePartyId;
	}

	public void setCustomerSitePartyId(Long customerSitePartyId) {
		this.customerSitePartyId = customerSitePartyId;
	}

	public String getDfltWoSubType() {
		return dfltWoSubType;
	}

	public void setDfltWoSubType(String dfltWoSubType) {
		this.dfltWoSubType = dfltWoSubType;
	}

	public String getDfltWoType() {
		return dfltWoType;
	}

	public void setDfltWoType(String dfltWoType) {
		this.dfltWoType = dfltWoType;
	}

	public Long getGenObjectId() {
		return genObjectId;
	}

	public void setGenObjectId(Long genObjectId) {
		this.genObjectId = genObjectId;
	}

	public Instant getInServiceDate() {
		return inServiceDate;
	}

	public void setInServiceDate(Instant inServiceDate) {
		this.inServiceDate = inServiceDate;
	}

	public Instant getInstalledDate() {
		return installedDate;
	}

	public void setInstalledDate(Instant installedDate) {
		this.installedDate = installedDate;
	}

	public String getInstalledLocationContext() {
		return installedLocationContext;
	}

	public void setInstalledLocationContext(String installedLocationContext) {
		this.installedLocationContext = installedLocationContext;
	}

	public Long getInstalledLocationId() {
		return installedLocationId;
	}

	public void setInstalledLocationId(Long installedLocationId) {
		this.installedLocationId = installedLocationId;
	}

	public Long getInvLocatorId() {
		return invLocatorId;
	}

	public void setInvLocatorId(Long invLocatorId) {
		this.invLocatorId = invLocatorId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemOrganizationId() {
		return itemOrganizationId;
	}

	public void setItemOrganizationId(Long itemOrganizationId) {
		this.itemOrganizationId = itemOrganizationId;
	}

	public String getItemRevision() {
		return itemRevision;
	}

	public void setItemRevision(String itemRevision) {
		this.itemRevision = itemRevision;
	}

	public Long getLocationOrganizationId() {
		return locationOrganizationId;
	}

	public void setLocationOrganizationId(Long locationOrganizationId) {
		this.locationOrganizationId = locationOrganizationId;
	}

	public Boolean getLogicalFlag() {
		return logicalFlag;
	}

	public void setLogicalFlag(Boolean logicalFlag) {
		this.logicalFlag = logicalFlag;
	}

	public String getLocationTypeCode() {
		return locationTypeCode;
	}

	public void setLocationTypeCode(String locationTypeCode) {
		this.locationTypeCode = locationTypeCode;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public Boolean getMaintainableFlag() {
		return maintainableFlag;
	}

	public void setMaintainableFlag(Boolean maintainableFlag) {
		this.maintainableFlag = maintainableFlag;
	}

	public Boolean getNewWoAllowedFlag() {
		return newWoAllowedFlag;
	}

	public void setNewWoAllowedFlag(Boolean newWoAllowedFlag) {
		this.newWoAllowedFlag = newWoAllowedFlag;
	}

	public Integer getObjectVersionNumber() {
		return objectVersionNumber;
	}

	public void setObjectVersionNumber(Integer objectVersionNumber) {
		this.objectVersionNumber = objectVersionNumber;
	}

	public String getOrderItemType() {
		return orderItemType;
	}

	public void setOrderItemType(String orderItemType) {
		this.orderItemType = orderItemType;
	}

	public Instant getOriginationDate() {
		return originationDate;
	}

	public void setOriginationDate(Instant originationDate) {
		this.originationDate = originationDate;
	}

	public String getOwnedBy() {
		return ownedBy;
	}

	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}

	public Long getParentAssetId() {
		return parentAssetId;
	}

	public void setParentAssetId(Long parentAssetId) {
		this.parentAssetId = parentAssetId;
	}

	public String getParentOrderLineId() {
		return parentOrderLineId;
	}

	public void setParentOrderLineId(String parentOrderLineId) {
		this.parentOrderLineId = parentOrderLineId;
	}

	public String getParentOrderLineNumber() {
		return parentOrderLineNumber;
	}

	public void setParentOrderLineNumber(String parentOrderLineNumber) {
		this.parentOrderLineNumber = parentOrderLineNumber;
	}

	public Boolean getPartiallyFinishedFlag() {
		return partiallyFinishedFlag;
	}

	public void setPartiallyFinishedFlag(Boolean partiallyFinishedFlag) {
		this.partiallyFinishedFlag = partiallyFinishedFlag;
	}

	public Instant getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Instant purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Boolean getRegisteredFlag() {
		return registeredFlag;
	}

	public void setRegisteredFlag(Boolean registeredFlag) {
		this.registeredFlag = registeredFlag;
	}

	public String getRmaFulfillLineId() {
		return rmaFulfillLineId;
	}

	public void setRmaFulfillLineId(String rmaFulfillLineId) {
		this.rmaFulfillLineId = rmaFulfillLineId;
	}

	public String getRmaHeaderId() {
		return rmaHeaderId;
	}

	public void setRmaHeaderId(String rmaHeaderId) {
		this.rmaHeaderId = rmaHeaderId;
	}

	public String getRmaLineId() {
		return rmaLineId;
	}

	public void setRmaLineId(String rmaLineId) {
		this.rmaLineId = rmaLineId;
	}

	public Long getSalesOrderFulfillLineId() {
		return salesOrderFulfillLineId;
	}

	public void setSalesOrderFulfillLineId(Long salesOrderFulfillLineId) {
		this.salesOrderFulfillLineId = salesOrderFulfillLineId;
	}

	public Long getSalesOrderHeaderId() {
		return salesOrderHeaderId;
	}

	public void setSalesOrderHeaderId(Long salesOrderHeaderId) {
		this.salesOrderHeaderId = salesOrderHeaderId;
	}

	public Long getSalesOrderLineId() {
		return salesOrderLineId;
	}

	public void setSalesOrderLineId(Long salesOrderLineId) {
		this.salesOrderLineId = salesOrderLineId;
	}

	public String getSalesOrderLineNumber() {
		return salesOrderLineNumber;
	}

	public void setSalesOrderLineNumber(String salesOrderLineNumber) {
		this.salesOrderLineNumber = salesOrderLineNumber;
	}

	public String getSalesOrderNumber() {
		return salesOrderNumber;
	}

	public void setSalesOrderNumber(String salesOrderNumber) {
		this.salesOrderNumber = salesOrderNumber;
	}

	public String getSalesOrderSourceSystem() {
		return salesOrderSourceSystem;
	}

	public void setSalesOrderSourceSystem(String salesOrderSourceSystem) {
		this.salesOrderSourceSystem = salesOrderSourceSystem;
	}

	public String getSalesOrderSourceSystemType() {
		return salesOrderSourceSystemType;
	}

	public void setSalesOrderSourceSystemType(String salesOrderSourceSystemType) {
		this.salesOrderSourceSystemType = salesOrderSourceSystemType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Instant getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Instant shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Long getSoldByBusinessUnitId() {
		return soldByBusinessUnitId;
	}

	public void setSoldByBusinessUnitId(Long soldByBusinessUnitId) {
		this.soldByBusinessUnitId = soldByBusinessUnitId;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getSubinventoryCode() {
		return subinventoryCode;
	}

	public void setSubinventoryCode(String subinventoryCode) {
		this.subinventoryCode = subinventoryCode;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Long getSupplierSiteId() {
		return supplierSiteId;
	}

	public void setSupplierSiteId(Long supplierSiteId) {
		this.supplierSiteId = supplierSiteId;
	}

	public String getUomCode() {
		return uomCode;
	}

	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
	}

	public Boolean getUnassignedFlag() {
		return unassignedFlag;
	}

	public void setUnassignedFlag(Boolean unassignedFlag) {
		this.unassignedFlag = unassignedFlag;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public Long getWorkCenterId() {
		return workCenterId;
	}

	public void setWorkCenterId(Long workCenterId) {
		this.workCenterId = workCenterId;
	}

	public Long getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(Long workOrderId) {
		this.workOrderId = workOrderId;
	}

	public Long getWorkOrderOperationId() {
		return workOrderOperationId;
	}

	public void setWorkOrderOperationId(Long workOrderOperationId) {
		this.workOrderOperationId = workOrderOperationId;
	}
	  
	  
}

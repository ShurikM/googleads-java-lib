
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NullStatsPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NullStatsPage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}Page">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullStatsPage")
@XmlSeeAlso({
    AdGroupFeedPage.class,
    CustomerFeedPage.class,
    FeedPage.class,
    FeedMappingPage.class,
    CampaignSharedSetPage.class,
    SharedSetPage.class,
    FeedItemPage.class,
    CampaignFeedPage.class,
    DraftPage.class
})
public abstract class NullStatsPage
    extends Page
{


}
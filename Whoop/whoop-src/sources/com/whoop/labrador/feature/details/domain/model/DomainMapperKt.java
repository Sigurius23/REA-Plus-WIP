package com.whoop.labrador.feature.details.domain.model;

import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lj1.C24473a;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rs1.AbstractC31794f;
import rt1.EnumC31808f;
import sk1.C32573b;
import yb3.AbstractC39420x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;", "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "toDomainHolder", "(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "", "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;", "Lsk1/b;", "toDeterminationViewState", "(Ljava/util/List;)Ljava/util/List;", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DomainMapperKt {
    public static final List<C32573b> toDeterminationViewState(List<ShepherdReading> list) {
        EnumC17727b2 enumC17727b2;
        AbstractC22676k.m65750j(list, "<this>");
        List<ShepherdReading> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (ShepherdReading shepherdReading : list2) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(shepherdReading.getTitle());
            String trendType = shepherdReading.getTrendType();
            EnumC17727b2 enumC17727b3 = EnumC17727b2.NEUTRAL;
            EnumC17727b2[] enumC17727b2ArrValues = EnumC17727b2.values();
            int length = enumC17727b2ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC17727b2 = null;
                    break;
                }
                enumC17727b2 = enumC17727b2ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC17727b2.name(), trendType)) {
                    break;
                }
                i13++;
            }
            if (enumC17727b2 != null) {
                enumC17727b3 = enumC17727b2;
            }
            arrayList.add(new C32573b(textResourceM21278l, enumC17727b3));
        }
        return arrayList;
    }

    public static final LabradorDetailsDomainHolder toDomainHolder(LabradorDetailsResponse labradorDetailsResponse) {
        TextResource textResourceM21267a;
        CtaTileModel addSymptomsAndNotesTile;
        TextResource textResourceM21277k;
        Instant instantOfEpochMilli;
        List arrayList;
        List<String> readingSymptoms;
        String strName;
        String notesSymptomsLabel;
        AbstractC22676k.m65750j(labradorDetailsResponse, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(labradorDetailsResponse.getReportTimestamp());
        List<Double> samples = labradorDetailsResponse.getSamples();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(labradorDetailsResponse.getArrhythmiaDetermination());
        List<C32573b> determinationViewState = toDeterminationViewState(labradorDetailsResponse.getArrhythmiaReadings());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(labradorDetailsResponse.getArrhythmiaInsightInformation());
        String averageHeartRate = labradorDetailsResponse.getAverageHeartRate();
        if (averageHeartRate == null || (textResourceM21267a = AbstractC8693b.m21278l(averageHeartRate)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        TextResource title = labradorDetailsResponse.getShareResultTile().getTitle();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(labradorDetailsResponse.getDisclaimerLabel());
        LabradorReadingNotesSymptomsModel readingSymptomsAndNotesTile = labradorDetailsResponse.getReadingSymptomsAndNotesTile();
        if ((readingSymptomsAndNotesTile == null || (notesSymptomsLabel = readingSymptomsAndNotesTile.getNotesSymptomsLabel()) == null || (textResourceM21277k = AbstractC8693b.m21278l(notesSymptomsLabel)) == null) && ((addSymptomsAndNotesTile = labradorDetailsResponse.getAddSymptomsAndNotesTile()) == null || (textResourceM21277k = addSymptomsAndNotesTile.getTitle()) == null)) {
            textResourceM21277k = AbstractC8693b.m21277k(AbstractC31794f.f131667l);
        }
        TextResource textResource2 = textResourceM21277k;
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(labradorDetailsResponse.getClearReadingLabel());
        String id4 = labradorDetailsResponse.getId();
        try {
            instantOfEpochMilli = (Instant) DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(labradorDetailsResponse.getTrailingTimestamp(), new C24473a(0));
        } catch (DateTimeParseException unused) {
            Float fM125915y = AbstractC39420x.m125915y(labradorDetailsResponse.getTrailingTimestamp());
            if (fM125915y == null || (instantOfEpochMilli = Instant.ofEpochMilli((long) fM125915y.floatValue())) == null) {
                instantOfEpochMilli = Instant.EPOCH;
            }
        }
        Instant instant = instantOfEpochMilli;
        AbstractC22676k.m65747g(instant);
        LabradorReadingNotesSymptomsModel readingSymptomsAndNotesTile2 = labradorDetailsResponse.getReadingSymptomsAndNotesTile();
        if (readingSymptomsAndNotesTile2 == null || (readingSymptoms = readingSymptomsAndNotesTile2.getReadingSymptoms()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<String> list = readingSymptoms;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Iterator it3 = it;
                EnumC31808f enumC31808fM98811a = EnumC31808f.INSTANCE.m98811a((String) it.next());
                if (enumC31808fM98811a == null || (strName = enumC31808fM98811a.name()) == null) {
                    strName = "";
                }
                arrayList.add(strName);
                it = it3;
            }
        }
        LabradorReadingNotesSymptomsModel readingSymptomsAndNotesTile3 = labradorDetailsResponse.getReadingSymptomsAndNotesTile();
        String readingNotes = readingSymptomsAndNotesTile3 != null ? readingSymptomsAndNotesTile3.getReadingNotes() : null;
        String pdfPresignedUrl = labradorDetailsResponse.getPdfPresignedUrl();
        PrivacyText protectYourPrivacy = labradorDetailsResponse.getProtectYourPrivacy();
        String title2 = protectYourPrivacy != null ? protectYourPrivacy.getTitle() : null;
        PrivacyText protectYourPrivacy2 = labradorDetailsResponse.getProtectYourPrivacy();
        return new LabradorDetailsDomainHolder(textResourceM21278l, samples, textResourceM21278l2, determinationViewState, textResourceM21278l3, textResource, title, textResourceM21278l4, textResource2, textResourceM21278l5, id4, instant, arrayList, readingNotes, pdfPresignedUrl, title2, protectYourPrivacy2 != null ? protectYourPrivacy2.getDescription() : null);
    }
}

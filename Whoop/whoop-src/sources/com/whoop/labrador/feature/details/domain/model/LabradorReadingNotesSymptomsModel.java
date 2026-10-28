package com.whoop.labrador.feature.details.domain.model;

import hc3.AbstractC17176i;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;", "", "notesSymptomsLabel", "", "titleIcon", "readingSymptoms", "", "notesIcon", "readingNotes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getNotesSymptomsLabel", "()Ljava/lang/String;", "getTitleIcon", "getReadingSymptoms", "()Ljava/util/List;", "getNotesIcon", "getReadingNotes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabradorReadingNotesSymptomsModel {
    public static final int $stable = 8;
    private final String notesIcon;
    private final String notesSymptomsLabel;
    private final String readingNotes;
    private final List<String> readingSymptoms;
    private final String titleIcon;

    public LabradorReadingNotesSymptomsModel() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabradorReadingNotesSymptomsModel copy$default(LabradorReadingNotesSymptomsModel labradorReadingNotesSymptomsModel, String str, String str2, List list, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labradorReadingNotesSymptomsModel.notesSymptomsLabel;
        }
        if ((i13 & 2) != 0) {
            str2 = labradorReadingNotesSymptomsModel.titleIcon;
        }
        if ((i13 & 4) != 0) {
            list = labradorReadingNotesSymptomsModel.readingSymptoms;
        }
        if ((i13 & 8) != 0) {
            str3 = labradorReadingNotesSymptomsModel.notesIcon;
        }
        if ((i13 & 16) != 0) {
            str4 = labradorReadingNotesSymptomsModel.readingNotes;
        }
        String str5 = str4;
        List list2 = list;
        return labradorReadingNotesSymptomsModel.copy(str, str2, list2, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNotesSymptomsLabel() {
        return this.notesSymptomsLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public final List<String> component3() {
        return this.readingSymptoms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNotesIcon() {
        return this.notesIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReadingNotes() {
        return this.readingNotes;
    }

    public final LabradorReadingNotesSymptomsModel copy(String notesSymptomsLabel, String titleIcon, List<String> readingSymptoms, String notesIcon, String readingNotes) {
        AbstractC22676k.m65750j(notesSymptomsLabel, "notesSymptomsLabel");
        AbstractC22676k.m65750j(titleIcon, "titleIcon");
        return new LabradorReadingNotesSymptomsModel(notesSymptomsLabel, titleIcon, readingSymptoms, notesIcon, readingNotes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorReadingNotesSymptomsModel)) {
            return false;
        }
        LabradorReadingNotesSymptomsModel labradorReadingNotesSymptomsModel = (LabradorReadingNotesSymptomsModel) other;
        return AbstractC22676k.m65745e(this.notesSymptomsLabel, labradorReadingNotesSymptomsModel.notesSymptomsLabel) && AbstractC22676k.m65745e(this.titleIcon, labradorReadingNotesSymptomsModel.titleIcon) && AbstractC22676k.m65745e(this.readingSymptoms, labradorReadingNotesSymptomsModel.readingSymptoms) && AbstractC22676k.m65745e(this.notesIcon, labradorReadingNotesSymptomsModel.notesIcon) && AbstractC22676k.m65745e(this.readingNotes, labradorReadingNotesSymptomsModel.readingNotes);
    }

    public final String getNotesIcon() {
        return this.notesIcon;
    }

    public final String getNotesSymptomsLabel() {
        return this.notesSymptomsLabel;
    }

    public final String getReadingNotes() {
        return this.readingNotes;
    }

    public final List<String> getReadingSymptoms() {
        return this.readingSymptoms;
    }

    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.notesSymptomsLabel.hashCode() * 31, 31, this.titleIcon);
        List<String> list = this.readingSymptoms;
        int iHashCode = (iM30450d + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.notesIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.readingNotes;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.notesSymptomsLabel;
        String str2 = this.titleIcon;
        List<String> list = this.readingSymptoms;
        String str3 = this.notesIcon;
        String str4 = this.readingNotes;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LabradorReadingNotesSymptomsModel(notesSymptomsLabel=", str, ", titleIcon=", str2, ", readingSymptoms=");
        AbstractC17176i.m48511m(", notesIcon=", str3, ", readingNotes=", sbM32001t, list);
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public LabradorReadingNotesSymptomsModel(String notesSymptomsLabel, String titleIcon, List<String> list, String str, String str2) {
        AbstractC22676k.m65750j(notesSymptomsLabel, "notesSymptomsLabel");
        AbstractC22676k.m65750j(titleIcon, "titleIcon");
        this.notesSymptomsLabel = notesSymptomsLabel;
        this.titleIcon = titleIcon;
        this.readingSymptoms = list;
        this.notesIcon = str;
        this.readingNotes = str2;
    }

    public /* synthetic */ LabradorReadingNotesSymptomsModel(String str, String str2, List list, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4);
    }
}

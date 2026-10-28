package com.whoop.design.models.anchorSelector;

import b91.EnumC2888c;
import com.whoop.design.util.AbstractC8693b;
import e51.AbstractC12730f;
import e51.AbstractC12739o;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import p31.AbstractC28805p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u0007*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u0007*\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "Lb91/c;", "resolveTitleTypography", "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lb91/c;", "Lp31/p$a;", "resolveAnchorSectionHeaderState", "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lp31/p$a;", "Ly3/f;", "resolveLeadingPadding", "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)F", "resolveTrailingPadding", "", "toSectionPadding", "(Ljava/lang/Double;)F", "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "resolveTagsHorizontalInset", "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)F", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AnchorSectionModelMappingKt {
    public static final AbstractC28805p.a resolveAnchorSectionHeaderState(AnchorSectionModel anchorSectionModel) {
        AnchorSectionDividerStyle anchorSectionDividerStyle;
        AbstractC22676k.m65750j(anchorSectionModel, "<this>");
        if (AbstractC39414r.m125890i0(anchorSectionModel.getTitle())) {
            return null;
        }
        String style = anchorSectionModel.getStyle();
        if (style == null) {
            anchorSectionDividerStyle = null;
            break;
        }
        AnchorSectionDividerStyle[] anchorSectionDividerStyleArrValues = AnchorSectionDividerStyle.values();
        int length = anchorSectionDividerStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                anchorSectionDividerStyle = null;
                break;
            }
            anchorSectionDividerStyle = anchorSectionDividerStyleArrValues[i13];
            if (AbstractC22676k.m65745e(anchorSectionDividerStyle.name(), style)) {
                break;
            }
            i13++;
        }
        if (anchorSectionDividerStyle == AnchorSectionDividerStyle.TITLE_STYLE_NONE) {
            return new AbstractC28805p.a(AbstractC8693b.m21278l(anchorSectionModel.getTitle()), null, null, resolveTitleTypography(anchorSectionModel), null, null, false, false, null, null, MessageListItemViewType.FILE_ATTACHMENTS, null);
        }
        return null;
    }

    public static final float resolveLeadingPadding(AnchorSectionModel anchorSectionModel) {
        AbstractC22676k.m65750j(anchorSectionModel, "<this>");
        return toSectionPadding(anchorSectionModel.getLeadingPadding());
    }

    public static final float resolveTagsHorizontalInset(AnchorSelectorModel anchorSelectorModel) {
        AbstractC22676k.m65750j(anchorSelectorModel, "<this>");
        Double tagsHorizontalInset = anchorSelectorModel.getTagsHorizontalInset();
        if (tagsHorizontalInset == null) {
            return AbstractC12739o.m35656a();
        }
        double dDoubleValue = tagsHorizontalInset.doubleValue();
        if (dDoubleValue < 0.0d) {
            dDoubleValue = 0.0d;
        }
        return (float) dDoubleValue;
    }

    public static final EnumC2888c resolveTitleTypography(AnchorSectionModel anchorSectionModel) {
        EnumC2888c enumC2888c;
        AbstractC22676k.m65750j(anchorSectionModel, "<this>");
        String titleTypography = anchorSectionModel.getTitleTypography();
        if (titleTypography != null) {
            EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
            int length = enumC2888cArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC2888c = null;
                    break;
                }
                enumC2888c = enumC2888cArrValues[i13];
                if (AbstractC22676k.m65745e(enumC2888c.name(), titleTypography)) {
                    break;
                }
                i13++;
            }
            if (enumC2888c != null) {
                return enumC2888c;
            }
        }
        return EnumC2888c.H5;
    }

    public static final float resolveTrailingPadding(AnchorSectionModel anchorSectionModel) {
        AbstractC22676k.m65750j(anchorSectionModel, "<this>");
        return toSectionPadding(anchorSectionModel.getTrailingPadding());
    }

    private static final float toSectionPadding(Double d3) {
        if (d3 == null) {
            return AbstractC12730f.m35600a();
        }
        double dDoubleValue = d3.doubleValue();
        if (dDoubleValue < 0.0d) {
            dDoubleValue = 0.0d;
        }
        return (float) dDoubleValue;
    }
}

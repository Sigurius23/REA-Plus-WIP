package com.whoop.bot.models.conversation;

import cm0.C4804a;
import nl0.AbstractC26802d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ActionButton;", "", "recId", "Lcm0/a;", "toActionButtonState", "(Lcom/whoop/bot/models/conversation/ActionButton;Ljava/lang/String;)Lcm0/a;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommittedWorkoutRecommendationModelKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionButtonActionType.values().length];
            try {
                iArr[ActionButtonActionType.NAVIGATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionButtonActionType.REGENERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionButtonActionType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final C4804a toActionButtonState(ActionButton actionButton, String str) {
        AbstractC26802d.a aVar;
        ActionButtonType actionButtonType;
        ActionButtonActionType actionButtonActionType;
        AbstractC26802d lVar;
        AbstractC22676k.m65750j(actionButton, "<this>");
        String type = actionButton.getType();
        ActionButtonType actionButtonType2 = ActionButtonType.PRIMARY;
        ActionButtonType[] actionButtonTypeArrValues = ActionButtonType.values();
        int length = actionButtonTypeArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            aVar = null;
            if (i14 >= length) {
                actionButtonType = null;
                break;
            }
            actionButtonType = actionButtonTypeArrValues[i14];
            if (AbstractC22676k.m65745e(actionButtonType.name(), type)) {
                break;
            }
            i14++;
        }
        ActionButtonType actionButtonType3 = actionButtonType == null ? actionButtonType2 : actionButtonType;
        String action = actionButton.getAction();
        ActionButtonActionType actionButtonActionType2 = ActionButtonActionType.NAVIGATE;
        ActionButtonActionType[] actionButtonActionTypeArrValues = ActionButtonActionType.values();
        int length2 = actionButtonActionTypeArrValues.length;
        while (true) {
            if (i13 >= length2) {
                actionButtonActionType = null;
                break;
            }
            actionButtonActionType = actionButtonActionTypeArrValues[i13];
            if (AbstractC22676k.m65745e(actionButtonActionType.name(), action)) {
                break;
            }
            i13++;
        }
        ActionButtonActionType actionButtonActionType3 = actionButtonActionType == null ? actionButtonActionType2 : actionButtonActionType;
        int i15 = WhenMappings.$EnumSwitchMapping$0[actionButtonActionType3.ordinal()];
        if (i15 == 1) {
            lVar = aVar;
        } else if (i15 == 2) {
            lVar = new AbstractC26802d.l(actionButton.getText(), 0, null, null, null, false, null, 126, null);
        } else {
            if (i15 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (str != null) {
                aVar = new AbstractC26802d.a(false, str, true, null, null, 24, null);
            }
            lVar = aVar;
        }
        return new C4804a(actionButton.getText(), actionButtonType3, actionButtonActionType3, actionButton.getDestination(), lVar);
    }

    public static /* synthetic */ C4804a toActionButtonState$default(ActionButton actionButton, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        return toActionButtonState(actionButton, str);
    }
}

.class public final Lcom/whoop/design/models/items/CommunityFollowerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;,
        Lcom/whoop/design/models/items/CommunityFollowerModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 g2\u00020\u0001:\u0002hgB\u0085\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u001b\u0010\u001cB\u00f3\u0001\u0008\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008\u001b\u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010#J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010#J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010#J\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010#J\u0012\u00101\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010#J\u0012\u00102\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010#J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u00109J\u0090\u0002\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001\u00a2\u0006\u0004\u0008;\u0010<J\u0010\u0010=\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008=\u0010#J\u0010\u0010>\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u001a\u0010C\u001a\u00020B2\u0008\u0010A\u001a\u0004\u0018\u00010@H\u00d6\u0003\u00a2\u0006\u0004\u0008C\u0010DJ\'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001\u00a2\u0006\u0004\u0008K\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010N\u001a\u0004\u0008O\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010N\u001a\u0004\u0008P\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010N\u001a\u0004\u0008Q\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010N\u001a\u0004\u0008R\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010N\u001a\u0004\u0008S\u0010#R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010N\u001a\u0004\u0008T\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010N\u001a\u0004\u0008U\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010N\u001a\u0004\u0008V\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010N\u001a\u0004\u0008W\u0010#R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010N\u001a\u0004\u0008X\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010N\u001a\u0004\u0008Y\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010N\u001a\u0004\u0008Z\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010N\u001a\u0004\u0008[\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010N\u001a\u0004\u0008\\\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010N\u001a\u0004\u0008]\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010N\u001a\u0004\u0008^\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010N\u001a\u0004\u0008_\u0010#R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010`\u001a\u0004\u0008a\u00105R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010b\u001a\u0004\u0008c\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010d\u001a\u0004\u0008e\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010d\u001a\u0004\u0008f\u00109\u00a8\u0006i"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CommunityFollowerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "title",
        "noDataLabel",
        "avatarUrl",
        "streak",
        "streakImageUrl",
        "recoveryScore",
        "recoveryLabel",
        "dayStrain",
        "strainLabel",
        "sleepScore",
        "sleepLabel",
        "recoveryColor",
        "strainColor",
        "sleepColor",
        "backgroundStyle",
        "avatarRingColor",
        "",
        "iconUrls",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "titleInteraction",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "()Ljava/util/List;",
        "component19",
        "()Lcom/whoop/navigation/e;",
        "component20",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component21",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/CommunityFollowerModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/CommunityFollowerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getNoDataLabel",
        "getAvatarUrl",
        "getStreak",
        "getStreakImageUrl",
        "getRecoveryScore",
        "getRecoveryLabel",
        "getDayStrain",
        "getStrainLabel",
        "getSleepScore",
        "getSleepLabel",
        "getRecoveryColor",
        "getStrainColor",
        "getSleepColor",
        "getBackgroundStyle",
        "getAvatarRingColor",
        "Ljava/util/List;",
        "getIconUrls",
        "Lcom/whoop/navigation/e;",
        "getNavigation",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "getTitleInteraction",
        "Companion",
        "$serializer",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/CommunityFollowerModel$Companion;


# instance fields
.field private final avatarRingColor:Ljava/lang/String;

.field private final avatarUrl:Ljava/lang/String;

.field private final backgroundStyle:Ljava/lang/String;

.field private final dayStrain:Ljava/lang/String;

.field private final iconUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final navigation:Lcom/whoop/navigation/e;

.field private final noDataLabel:Ljava/lang/String;

.field private final recoveryColor:Ljava/lang/String;

.field private final recoveryLabel:Ljava/lang/String;

.field private final recoveryScore:Ljava/lang/String;

.field private final sleepColor:Ljava/lang/String;

.field private final sleepLabel:Ljava/lang/String;

.field private final sleepScore:Ljava/lang/String;

.field private final strainColor:Ljava/lang/String;

.field private final strainLabel:Ljava/lang/String;

.field private final streak:Ljava/lang/String;

.field private final streakImageUrl:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/items/CommunityFollowerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/CommunityFollowerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->Companion:Lcom/whoop/design/models/items/CommunityFollowerModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/b;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lw91/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/b;

    const/4 v6, 0x5

    invoke-direct {v5, v6}, Lw91/b;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x15

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v1, v5, v7

    const/4 v7, 0x2

    aput-object v1, v5, v7

    const/4 v7, 0x3

    aput-object v1, v5, v7

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/4 v4, 0x6

    aput-object v1, v5, v4

    const/4 v4, 0x7

    aput-object v1, v5, v4

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    const/16 v0, 0xb

    aput-object v1, v5, v0

    const/16 v0, 0xc

    aput-object v1, v5, v0

    const/16 v0, 0xd

    aput-object v1, v5, v0

    const/16 v0, 0xe

    aput-object v1, v5, v0

    const/16 v0, 0xf

    aput-object v1, v5, v0

    const/16 v0, 0x10

    aput-object v1, v5, v0

    const/16 v0, 0x11

    aput-object v3, v5, v0

    const/16 v0, 0x12

    aput-object v2, v5, v0

    const/16 v0, 0x13

    aput-object v1, v5, v0

    const/16 v0, 0x14

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/design/models/items/CommunityFollowerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CommunityFollowerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    goto :goto_8

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    goto :goto_9

    :cond_a
    iput-object p12, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    :goto_9
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    goto :goto_a

    :cond_b
    iput-object p13, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    :goto_a
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    :goto_b
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_d

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    :goto_c
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_e

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    goto :goto_d

    :cond_e
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    :goto_d
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_f

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    goto :goto_e

    :cond_f
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    :goto_e
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_10

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    goto :goto_f

    :cond_10
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    :goto_f
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_11

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    goto :goto_10

    :cond_11
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    :goto_10
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_12

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    goto :goto_11

    :cond_12
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    :goto_11
    const/high16 p2, 0x80000

    and-int/2addr p2, p1

    if-nez p2, :cond_13

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_12

    :cond_13
    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_12
    const/high16 p2, 0x100000

    and-int/2addr p1, p2

    if-nez p1, :cond_14

    iput-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void

    :cond_14
    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    .line 16
    iput-object p14, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p22

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_6

    move-object v8, v2

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_8

    move-object v10, v2

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_9

    move-object v11, v2

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_a

    move-object v12, v2

    goto :goto_a

    :cond_a
    move-object/from16 v12, p12

    :goto_a
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_b

    move-object v13, v2

    goto :goto_b

    :cond_b
    move-object/from16 v13, p13

    :goto_b
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_c

    move-object v14, v2

    goto :goto_c

    :cond_c
    move-object/from16 v14, p14

    :goto_c
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_d

    move-object v15, v2

    goto :goto_d

    :cond_d
    move-object/from16 v15, p15

    :goto_d
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_e

    move-object/from16 v16, v2

    goto :goto_e

    :cond_e
    move-object/from16 v16, p16

    :goto_e
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_f

    move-object/from16 v17, v2

    goto :goto_f

    :cond_f
    move-object/from16 v17, p17

    :goto_f
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_10

    move-object/from16 v18, v2

    goto :goto_10

    :cond_10
    move-object/from16 v18, p18

    :goto_10
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_11

    move-object/from16 v19, v2

    goto :goto_11

    :cond_11
    move-object/from16 v19, p19

    :goto_11
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_12

    move-object/from16 v20, v2

    goto :goto_12

    :cond_12
    move-object/from16 v20, p20

    :goto_12
    const/high16 v21, 0x100000

    and-int v0, v0, v21

    if-eqz v0, :cond_13

    move-object/from16 p23, v2

    :goto_13
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    move-object/from16 p10, v8

    move-object/from16 p11, v9

    move-object/from16 p12, v10

    move-object/from16 p13, v11

    move-object/from16 p14, v12

    move-object/from16 p15, v13

    move-object/from16 p16, v14

    move-object/from16 p17, v15

    move-object/from16 p18, v16

    move-object/from16 p19, v17

    move-object/from16 p20, v18

    move-object/from16 p21, v19

    move-object/from16 p22, v20

    goto :goto_14

    :cond_13
    move-object/from16 p23, p21

    goto :goto_13

    .line 24
    :goto_14
    invoke-direct/range {p2 .. p23}, Lcom/whoop/design/models/items/CommunityFollowerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CommunityFollowerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CommunityFollowerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/CommunityFollowerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/design/models/items/CommunityFollowerModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p22, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p22, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p22, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p22, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p22, v16

    if-eqz v16, :cond_14

    move-object/from16 p6, v1

    iget-object v1, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 p21, p6

    move-object/from16 p22, v1

    :goto_14
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_15

    :cond_14
    move-object/from16 p22, p21

    move-object/from16 p21, v1

    goto :goto_14

    :goto_15
    invoke-virtual/range {p1 .. p22}, Lcom/whoop/design/models/items/CommunityFollowerModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/CommunityFollowerModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/CommunityFollowerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_7
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    if-eqz v2, :cond_13

    :goto_9
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    if-eqz v2, :cond_15

    :goto_a
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_b

    :cond_16
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    if-eqz v2, :cond_17

    :goto_b
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_c

    :cond_18
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    if-eqz v2, :cond_19

    :goto_c
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    if-eqz v2, :cond_1b

    :goto_d
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    if-eqz v2, :cond_1d

    :goto_e
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1d
    const/16 v1, 0x10

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    if-eqz v2, :cond_1f

    :goto_f
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1f
    const/16 v1, 0x11

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_20

    goto :goto_10

    :cond_20
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    if-eqz v2, :cond_21

    :goto_10
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_21
    const/16 v1, 0x12

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_22

    goto :goto_11

    :cond_22
    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_23

    :goto_11
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_23
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_24

    goto :goto_12

    :cond_24
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_25

    :goto_12
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_25
    const/16 v0, 0x14

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_13

    :cond_26
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_27

    :goto_13
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_27
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    return-object v0
.end method

.method public final component19()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component21()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/CommunityFollowerModel;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")",
            "Lcom/whoop/design/models/items/CommunityFollowerModel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/CommunityFollowerModel;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    invoke-direct/range {v1 .. v22}, Lcom/whoop/design/models/items/CommunityFollowerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/CommunityFollowerModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final getAvatarRingColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayStrain()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconUrls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getNavigation()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getNoDataLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecoveryColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecoveryLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecoveryScore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSleepScore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    return-object v0
.end method

.method public final getStrainColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getStrainLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getStreak()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    return-object v0
.end method

.method public final getStreakImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_10

    :cond_10
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_11

    :cond_11
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_12

    :cond_12
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_13

    goto :goto_13

    :cond_13
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->title:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->noDataLabel:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streak:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->streakImageUrl:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryScore:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryLabel:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->dayStrain:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainLabel:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepScore:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepLabel:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->recoveryColor:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->strainColor:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->sleepColor:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->backgroundStyle:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->avatarRingColor:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->iconUrls:Ljava/util/List;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->navigation:Lcom/whoop/navigation/e;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CommunityFollowerModel;->titleInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const-string v0, ", title="

    move-object/from16 v22, v15

    const-string v15, ", noDataLabel="

    move-object/from16 v23, v13

    const-string v13, "CommunityFollowerModel(id="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", avatarUrl="

    const-string v2, ", streak="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", streakImageUrl="

    const-string v2, ", recoveryScore="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", recoveryLabel="

    const-string v2, ", dayStrain="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", strainLabel="

    const-string v2, ", sleepScore="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", sleepLabel="

    const-string v2, ", recoveryColor="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", strainColor="

    const-string v2, ", sleepColor="

    move-object/from16 v3, v23

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", backgroundStyle="

    const-string v2, ", avatarRingColor="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", iconUrls="

    const-string v2, ", navigation="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v3, v1, v2, v0, v4}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", titleInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v22

    invoke-static {v0, v2, v1}, Lnh3/a;->j(Ljava/lang/StringBuilder;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

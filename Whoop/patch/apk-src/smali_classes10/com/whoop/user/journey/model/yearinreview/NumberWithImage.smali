.class public final Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/user/journey/model/UserJourneyStep;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$$serializer;,
        Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 Y2\u00020\u0001:\u0002ZYB\u00b7\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u00c3\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0008\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010 J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010 J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010 J\u0010\u0010,\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010-J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010&J\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010 J\u0012\u00101\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010 J\u0012\u00102\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010 J\u00cc\u0001\u00103\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00082\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00085\u0010 J\u0010\u00106\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u00086\u00107J\u001a\u0010:\u001a\u00020\u00102\u0008\u00109\u001a\u0004\u0018\u000108H\u00d6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001\u00a2\u0006\u0004\u0008B\u0010CR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010E\u001a\u0004\u0008F\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010E\u001a\u0004\u0008G\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010H\u001a\u0004\u0008I\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010E\u001a\u0004\u0008J\u0010 R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010K\u001a\u0004\u0008L\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010E\u001a\u0004\u0008M\u0010 R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010E\u001a\u0004\u0008N\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010E\u001a\u0004\u0008O\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008P\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010E\u001a\u0004\u0008Q\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010R\u001a\u0004\u0008S\u0010-R\u0017\u0010\u0012\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010R\u001a\u0004\u0008T\u0010-R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010K\u001a\u0004\u0008U\u0010&R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010E\u001a\u0004\u0008V\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010E\u001a\u0004\u0008W\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010E\u001a\u0004\u0008X\u0010 \u00a8\u0006["
    }
    d2 = {
        "Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;",
        "Lcom/whoop/user/journey/model/UserJourneyStep;",
        "",
        "title",
        "displayNumber",
        "Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;",
        "numberFontSize",
        "imageUrl",
        "",
        "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
        "highlightedTexts",
        "name",
        "theme",
        "themeVariant",
        "recoveryBadgeLevel",
        "recoveryBadgeImageUrl",
        "",
        "foundingMember",
        "whoopPro",
        "Lcom/whoop/user/journey/model/yearinreview/FooterText;",
        "footerTexts",
        "footerText",
        "footerSubText",
        "backgroundImageUrl",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Z",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$user_journey_release",
        "(Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getDisplayNumber",
        "Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;",
        "getNumberFontSize",
        "getImageUrl",
        "Ljava/util/List;",
        "getHighlightedTexts",
        "getName",
        "getTheme",
        "getThemeVariant",
        "getRecoveryBadgeLevel",
        "getRecoveryBadgeImageUrl",
        "Z",
        "getFoundingMember",
        "getWhoopPro",
        "getFooterTexts",
        "getFooterText",
        "getFooterSubText",
        "getBackgroundImageUrl",
        "Companion",
        "$serializer",
        "user-journey_release"
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

.field public static final Companion:Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$Companion;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;

.field private final displayNumber:Ljava/lang/String;

.field private final footerSubText:Ljava/lang/String;

.field private final footerText:Ljava/lang/String;

.field private final footerTexts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/FooterText;",
            ">;"
        }
    .end annotation
.end field

.field private final foundingMember:Z

.field private final highlightedTexts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
            ">;"
        }
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

.field private final recoveryBadgeImageUrl:Ljava/lang/String;

.field private final recoveryBadgeLevel:Ljava/lang/String;

.field private final theme:Ljava/lang/String;

.field private final themeVariant:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final whoopPro:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->Companion:Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcq2/a;

    invoke-direct {v3, v0}, Lcq2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcq2/a;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lcq2/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Lcq2/a;

    const/16 v7, 0xa

    invoke-direct {v6, v7}, Lcq2/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v6, 0x10

    new-array v6, v6, [Ll83/h;

    const/4 v8, 0x0

    aput-object v1, v6, v8

    const/4 v8, 0x1

    aput-object v1, v6, v8

    const/4 v8, 0x2

    aput-object v3, v6, v8

    const/4 v3, 0x3

    aput-object v1, v6, v3

    const/4 v3, 0x4

    aput-object v4, v6, v3

    const/4 v3, 0x5

    aput-object v1, v6, v3

    const/4 v3, 0x6

    aput-object v1, v6, v3

    const/4 v3, 0x7

    aput-object v1, v6, v3

    aput-object v1, v6, v0

    aput-object v1, v6, v5

    aput-object v1, v6, v7

    const/16 v0, 0xb

    aput-object v1, v6, v0

    const/16 v0, 0xc

    aput-object v2, v6, v0

    const/16 v0, 0xd

    aput-object v1, v6, v0

    const/16 v0, 0xe

    aput-object v1, v6, v0

    const/16 v0, 0xf

    aput-object v1, v6, v0

    sput-object v6, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0xfa

    const/16 v1, 0xfa

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$$serializer;

    invoke-virtual {v0}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iput-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    :goto_0
    iput-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    :goto_1
    iput-object p5, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x100

    const-string p3, ""

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p10, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p11, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    :goto_3
    and-int/lit16 p2, p1, 0x400

    const/4 p3, 0x0

    if-nez p2, :cond_5

    iput-boolean p3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    goto :goto_4

    :cond_5
    iput-boolean p12, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    :goto_4
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_6

    iput-boolean p3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    goto :goto_5

    :cond_6
    iput-boolean p13, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    :goto_5
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    goto :goto_6

    :cond_7
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    :goto_6
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    :goto_8
    const p2, 0x8000

    and-int/2addr p1, p2

    if-nez p1, :cond_a

    iput-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    return-void

    :cond_a
    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/FooterText;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "displayNumber"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highlightedTexts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeVariant"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    .line 6
    iput-object p4, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    .line 13
    iput-boolean p11, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    .line 14
    iput-boolean p12, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    .line 15
    iput-object p13, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    .line 16
    iput-object p14, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit16 v1, v0, 0x100

    .line 19
    const-string v3, ""

    if-eqz v1, :cond_2

    move-object v12, v3

    goto :goto_2

    :cond_2
    move-object/from16 v12, p9

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move-object v13, v3

    goto :goto_3

    :cond_3
    move-object/from16 v13, p10

    :goto_3
    and-int/lit16 v1, v0, 0x400

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    move v14, v3

    goto :goto_4

    :cond_4
    move/from16 v14, p11

    :goto_4
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_5

    move v15, v3

    goto :goto_5

    :cond_5
    move/from16 v15, p12

    :goto_5
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_6

    move-object/from16 v16, v2

    goto :goto_6

    :cond_6
    move-object/from16 v16, p13

    :goto_6
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_7

    move-object/from16 v17, v2

    goto :goto_7

    :cond_7
    move-object/from16 v17, p14

    :goto_7
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_8

    move-object/from16 v18, v2

    goto :goto_8

    :cond_8
    move-object/from16 v18, p15

    :goto_8
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_9

    move-object/from16 v19, v2

    :goto_9
    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    goto :goto_a

    :cond_9
    move-object/from16 v19, p16

    goto :goto_9

    :goto_a
    invoke-direct/range {v3 .. v19}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;->Companion:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize$Companion;

    invoke-virtual {v0}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/user/journey/model/yearinreview/HighlightedText$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/HighlightedText$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/user/journey/model/yearinreview/FooterText$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/FooterText$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

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

    move/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$user_journey_release(Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    if-eqz v2, :cond_9

    :goto_4
    iget-boolean v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_9
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-boolean v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    if-eqz v2, :cond_b

    :goto_5
    iget-boolean v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_b
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    return v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/FooterText;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/FooterText;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;"
        }
    .end annotation

    const-string v0, "displayNumber"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highlightedTexts"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeVariant"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    iget-boolean v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    iget-boolean v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooterSubText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooterText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooterTexts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/FooterText;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    return-object v0
.end method

.method public final getFoundingMember()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    return v0
.end method

.method public final getHighlightedTexts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumberFontSize()Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    return-object v0
.end method

.method public final getRecoveryBadgeImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecoveryBadgeLevel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    return-object v0
.end method

.method public final getThemeVariant()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getWhoopPro()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->title:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->displayNumber:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->numberFontSize:Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;

    iget-object v4, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->imageUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->highlightedTexts:Ljava/util/List;

    iget-object v6, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->name:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->theme:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->themeVariant:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeLevel:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->recoveryBadgeImageUrl:Ljava/lang/String;

    iget-boolean v11, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->foundingMember:Z

    iget-boolean v12, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->whoopPro:Z

    iget-object v13, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerTexts:Ljava/util/List;

    iget-object v14, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerText:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->footerSubText:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;->backgroundImageUrl:Ljava/lang/String;

    const-string v0, ", displayNumber="

    move-object/from16 v17, v15

    const-string v15, ", numberFontSize="

    move-object/from16 v18, v13

    const-string v13, "NumberWithImage(title="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", highlightedTexts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    const-string v2, ", theme="

    invoke-static {v1, v6, v2, v0, v5}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", themeVariant="

    const-string v2, ", recoveryBadgeLevel="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", recoveryBadgeImageUrl="

    const-string v2, ", foundingMember="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", whoopPro="

    const-string v2, ", footerTexts="

    invoke-static {v0, v11, v1, v12, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", footerText="

    const-string v2, ", footerSubText="

    move-object/from16 v3, v18

    invoke-static {v1, v14, v2, v0, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", backgroundImageUrl="

    const-string v2, ")"

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

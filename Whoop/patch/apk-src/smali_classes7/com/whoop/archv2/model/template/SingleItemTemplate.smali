.class public final Lcom/whoop/archv2/model/template/SingleItemTemplate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/archv2/model/template/ScreenTemplate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/archv2/model/template/SingleItemTemplate$$serializer;,
        Lcom/whoop/archv2/model/template/SingleItemTemplate$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u0000 Z2\u00020\u0001:\u0002[\\Bw\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u007f\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0080\u0001\u00101\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00083\u0010.J\u0010\u00104\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00109\u001a\u0002082\u0008\u00107\u001a\u0004\u0018\u000106H\u00d6\u0003\u00a2\u0006\u0004\u00089\u0010:J\'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001\u00a2\u0006\u0004\u0008A\u0010BR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010D\u001a\u0004\u0008E\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010F\u001a\u0004\u0008G\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010H\u001a\u0004\u0008I\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010J\u001a\u0004\u0008K\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010L\u001a\u0004\u0008M\u0010&R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010N\u001a\u0004\u0008O\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010P\u001a\u0004\u0008Q\u0010*R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010R\u001a\u0004\u0008S\u0010,R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010T\u0012\u0004\u0008V\u0010W\u001a\u0004\u0008U\u0010.R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010X\u001a\u0004\u0008Y\u00100\u00a8\u0006]"
    }
    d2 = {
        "Lcom/whoop/archv2/model/template/SingleItemTemplate;",
        "Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "Lcom/whoop/archv2/model/template/MetaData;",
        "screenMetadata",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "navigationBar",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "item",
        "Lcom/whoop/design/models/items/FooterModel;",
        "footer",
        "Lcom/whoop/archv2/model/template/HorizontalAlignment;",
        "horizontalAlignment",
        "Lcom/whoop/archv2/model/template/VerticalAlignment;",
        "verticalAlignment",
        "Lcom/whoop/archv2/model/template/FillMode;",
        "fillMode",
        "Lcom/whoop/archv2/model/template/TemplatePadding;",
        "padding",
        "",
        "backgroundImageUrl",
        "Lcom/whoop/archv2/model/template/BackgroundModel;",
        "background",
        "<init>",
        "(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/archv2/model/template/MetaData;",
        "component2",
        "()Lcom/whoop/design/models/items/NavigationBarModel;",
        "component3",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component4",
        "()Lcom/whoop/design/models/items/FooterModel;",
        "component5",
        "()Lcom/whoop/archv2/model/template/HorizontalAlignment;",
        "component6",
        "()Lcom/whoop/archv2/model/template/VerticalAlignment;",
        "component7",
        "()Lcom/whoop/archv2/model/template/FillMode;",
        "component8",
        "()Lcom/whoop/archv2/model/template/TemplatePadding;",
        "component9",
        "()Ljava/lang/String;",
        "component10",
        "()Lcom/whoop/archv2/model/template/BackgroundModel;",
        "copy",
        "(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)Lcom/whoop/archv2/model/template/SingleItemTemplate;",
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
        "write$Self$arch_v2_release",
        "(Lcom/whoop/archv2/model/template/SingleItemTemplate;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/archv2/model/template/MetaData;",
        "getScreenMetadata",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "getNavigationBar",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getItem",
        "Lcom/whoop/design/models/items/FooterModel;",
        "getFooter",
        "Lcom/whoop/archv2/model/template/HorizontalAlignment;",
        "getHorizontalAlignment",
        "Lcom/whoop/archv2/model/template/VerticalAlignment;",
        "getVerticalAlignment",
        "Lcom/whoop/archv2/model/template/FillMode;",
        "getFillMode",
        "Lcom/whoop/archv2/model/template/TemplatePadding;",
        "getPadding",
        "Ljava/lang/String;",
        "getBackgroundImageUrl",
        "getBackgroundImageUrl$annotations",
        "()V",
        "Lcom/whoop/archv2/model/template/BackgroundModel;",
        "getBackground",
        "Companion",
        "$serializer",
        "a",
        "arch-v2_release"
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

.field public static final Companion:Lcom/whoop/archv2/model/template/SingleItemTemplate$a;


# instance fields
.field private final background:Lcom/whoop/archv2/model/template/BackgroundModel;

.field private final backgroundImageUrl:Ljava/lang/String;

.field private final fillMode:Lcom/whoop/archv2/model/template/FillMode;

.field private final footer:Lcom/whoop/design/models/items/FooterModel;

.field private final horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

.field private final item:Lcom/whoop/design/models/DesignSystemModel;

.field private final navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

.field private final padding:Lcom/whoop/archv2/model/template/TemplatePadding;

.field private final screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

.field private final verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/whoop/archv2/model/template/SingleItemTemplate$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/archv2/model/template/SingleItemTemplate$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->Companion:Lcom/whoop/archv2/model/template/SingleItemTemplate$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcj0/f;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcj0/f;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lcj0/f;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lcj0/f;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lcj0/f;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Lcj0/f;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lcj0/f;

    const/4 v10, 0x3

    invoke-direct {v9, v10}, Lcj0/f;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v9, 0xa

    new-array v9, v9, [Ll83/h;

    aput-object v1, v9, v4

    aput-object v1, v9, v6

    aput-object v3, v9, v8

    aput-object v1, v9, v10

    const/4 v3, 0x4

    aput-object v5, v9, v3

    const/4 v3, 0x5

    aput-object v7, v9, v3

    const/4 v3, 0x6

    aput-object v2, v9, v3

    const/4 v2, 0x7

    aput-object v1, v9, v2

    aput-object v1, v9, v0

    const/16 v0, 0x9

    aput-object v1, v9, v0

    sput-object v9, Lcom/whoop/archv2/model/template/SingleItemTemplate;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/whoop/archv2/model/template/SingleItemTemplate;-><init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 13

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    :goto_0
    and-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_1

    iput-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    goto :goto_1

    :cond_1
    move-object/from16 v0, p3

    iput-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    :goto_1
    and-int/lit8 v0, p1, 0x4

    if-nez v0, :cond_2

    iput-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_2

    :cond_2
    move-object/from16 v0, p4

    iput-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    :goto_2
    and-int/lit8 v0, p1, 0x8

    if-nez v0, :cond_3

    iput-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    goto :goto_3

    :cond_3
    move-object/from16 v0, p5

    iput-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    :goto_3
    and-int/lit8 v0, p1, 0x10

    if-nez v0, :cond_4

    .line 3
    sget-object v0, Lcom/whoop/archv2/model/template/HorizontalAlignment;->CENTER:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    .line 4
    :goto_4
    iput-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    goto :goto_5

    :cond_4
    move-object/from16 v0, p6

    goto :goto_4

    :goto_5
    and-int/lit8 v0, p1, 0x20

    if-nez v0, :cond_5

    .line 5
    sget-object v0, Lcom/whoop/archv2/model/template/VerticalAlignment;->CENTER:Lcom/whoop/archv2/model/template/VerticalAlignment;

    .line 6
    :goto_6
    iput-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    goto :goto_7

    :cond_5
    move-object/from16 v0, p7

    goto :goto_6

    :goto_7
    and-int/lit8 v0, p1, 0x40

    if-nez v0, :cond_6

    .line 7
    sget-object v0, Lcom/whoop/archv2/model/template/FillMode;->FIT_CONTENT:Lcom/whoop/archv2/model/template/FillMode;

    .line 8
    :goto_8
    iput-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    goto :goto_9

    :cond_6
    move-object/from16 v0, p8

    goto :goto_8

    :goto_9
    and-int/lit16 v0, p1, 0x80

    if-nez v0, :cond_7

    .line 9
    new-instance v2, Lcom/whoop/archv2/model/template/TemplatePadding;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/whoop/archv2/model/template/TemplatePadding;-><init>(DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    iput-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    goto :goto_a

    :cond_7
    move-object/from16 v0, p9

    iput-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    :goto_a
    and-int/lit16 v0, p1, 0x100

    if-nez v0, :cond_8

    iput-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    goto :goto_b

    :cond_8
    move-object/from16 v0, p10

    iput-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    :goto_b
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_9

    iput-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    return-void

    :cond_9
    move-object/from16 p1, p11

    iput-object p1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)V
    .locals 1

    const-string v0, "horizontalAlignment"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verticalAlignment"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fillMode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    .line 13
    iput-object p2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    .line 14
    iput-object p3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    .line 15
    iput-object p4, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    .line 16
    iput-object p5, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    .line 17
    iput-object p6, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    .line 18
    iput-object p7, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    .line 19
    iput-object p8, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    .line 20
    iput-object p9, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    .line 21
    iput-object p10, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    .line 22
    sget-object v6, Lcom/whoop/archv2/model/template/HorizontalAlignment;->CENTER:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    .line 23
    sget-object v7, Lcom/whoop/archv2/model/template/VerticalAlignment;->CENTER:Lcom/whoop/archv2/model/template/VerticalAlignment;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    .line 24
    sget-object v8, Lcom/whoop/archv2/model/template/FillMode;->FIT_CONTENT:Lcom/whoop/archv2/model/template/FillMode;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    .line 25
    new-instance v10, Lcom/whoop/archv2/model/template/TemplatePadding;

    const/16 v19, 0xf

    const/16 v20, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    invoke-direct/range {v10 .. v20}, Lcom/whoop/archv2/model/template/TemplatePadding;-><init>(DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    move-object v9, v2

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    move-object/from16 p11, v2

    :goto_9
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p10, v9

    move-object/from16 p9, v10

    goto :goto_a

    :cond_9
    move-object/from16 p11, p10

    goto :goto_9

    .line 26
    :goto_a
    invoke-direct/range {p1 .. p11}, Lcom/whoop/archv2/model/template/SingleItemTemplate;-><init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/HorizontalAlignment;->Companion:Lcom/whoop/archv2/model/template/HorizontalAlignment$a;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/HorizontalAlignment$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/VerticalAlignment;->Companion:Lcom/whoop/archv2/model/template/VerticalAlignment$a;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/VerticalAlignment$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/FillMode;->Companion:Lcom/whoop/archv2/model/template/FillMode$a;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/FillMode$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/archv2/model/template/SingleItemTemplate;Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;ILjava/lang/Object;)Lcom/whoop/archv2/model/template/SingleItemTemplate;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->copy(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)Lcom/whoop/archv2/model/template/SingleItemTemplate;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/SingleItemTemplate;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getBackgroundImageUrl$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$arch_v2_release(Lcom/whoop/archv2/model/template/SingleItemTemplate;Lzc3/c;Lyc3/g;)V
    .locals 13

    sget-object v0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/archv2/model/template/MetaData$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/MetaData$$serializer;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/items/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationBarModel$$serializer;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/design/models/items/FooterModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FooterModel$$serializer;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    sget-object v3, Lcom/whoop/archv2/model/template/HorizontalAlignment;->CENTER:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    if-eq v2, v3, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    sget-object v3, Lcom/whoop/archv2/model/template/VerticalAlignment;->CENTER:Lcom/whoop/archv2/model/template/VerticalAlignment;

    if-eq v2, v3, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    sget-object v3, Lcom/whoop/archv2/model/template/FillMode;->FIT_CONTENT:Lcom/whoop/archv2/model/template/FillMode;

    if-eq v2, v3, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    new-instance v2, Lcom/whoop/archv2/model/template/TemplatePadding;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/whoop/archv2/model/template/TemplatePadding;-><init>(DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/archv2/model/template/TemplatePadding$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/TemplatePadding$$serializer;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lcom/whoop/archv2/model/template/BackgroundModel$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/BackgroundModel$$serializer;

    iget-object p0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/archv2/model/template/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    return-object v0
.end method

.method public final component10()Lcom/whoop/archv2/model/template/BackgroundModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/FooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/archv2/model/template/HorizontalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    return-object v0
.end method

.method public final component6()Lcom/whoop/archv2/model/template/VerticalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    return-object v0
.end method

.method public final component7()Lcom/whoop/archv2/model/template/FillMode;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    return-object v0
.end method

.method public final component8()Lcom/whoop/archv2/model/template/TemplatePadding;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)Lcom/whoop/archv2/model/template/SingleItemTemplate;
    .locals 12

    const-string v0, "horizontalAlignment"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verticalAlignment"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fillMode"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/archv2/model/template/SingleItemTemplate;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/archv2/model/template/SingleItemTemplate;-><init>(Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Lcom/whoop/archv2/model/template/TemplatePadding;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackgroundModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    iget-object p1, p1, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public bridge failureAnalyticEvent(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/archv2/model/template/ScreenTemplate;->failureAnalyticEvent(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    return-object p1
.end method

.method public final getBackground()Lcom/whoop/archv2/model/template/BackgroundModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    return-object v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getFillMode()Lcom/whoop/archv2/model/template/FillMode;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/design/models/items/FooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    return-object v0
.end method

.method public final getHorizontalAlignment()Lcom/whoop/archv2/model/template/HorizontalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    return-object v0
.end method

.method public final getItem()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public bridge getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;
    .locals 1

    invoke-super {p0}, Lcom/whoop/archv2/model/template/ScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v0

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public final getPadding()Lcom/whoop/archv2/model/template/TemplatePadding;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    return-object v0
.end method

.method public final getScreenMetadata()Lcom/whoop/archv2/model/template/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    return-object v0
.end method

.method public final getVerticalAlignment()Lcom/whoop/archv2/model/template/VerticalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/MetaData;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/NavigationBarModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/FooterModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/TemplatePadding;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/archv2/model/template/BackgroundModel;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->screenMetadata:Lcom/whoop/archv2/model/template/MetaData;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->item:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->footer:Lcom/whoop/design/models/items/FooterModel;

    iget-object v4, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->horizontalAlignment:Lcom/whoop/archv2/model/template/HorizontalAlignment;

    iget-object v5, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->verticalAlignment:Lcom/whoop/archv2/model/template/VerticalAlignment;

    iget-object v6, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->fillMode:Lcom/whoop/archv2/model/template/FillMode;

    iget-object v7, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->padding:Lcom/whoop/archv2/model/template/TemplatePadding;

    iget-object v8, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->backgroundImageUrl:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/archv2/model/template/SingleItemTemplate;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "SingleItemTemplate(screenMetadata="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationBar="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", item="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", horizontalAlignment="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", verticalAlignment="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fillMode="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", padding="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundImageUrl="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", background="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

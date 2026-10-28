.class public final Lio/getstream/chat/android/ui/font/TextStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/font/TextStyle$Builder;,
        Lio/getstream/chat/android/ui/font/TextStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0013\u0008\u0086\u0008\u0018\u0000 92\u00020\u0001:\u00029:BY\u0012\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004\u0012\u0008\u0008\u0003\u0010\n\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#Jb\u0010$\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0003\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001aJ\u001a\u0010*\u001a\u00020\u00142\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u00080\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u00081\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u00082\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010.\u001a\u0004\u00083\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010,\u001a\u0004\u00084\u0010\u001aR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u00086\u0010#R\u0013\u00108\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\u00087\u0010#\u00a8\u0006;"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "Ljava/io/Serializable;",
        "",
        "fontResource",
        "",
        "fontAssetsPath",
        "style",
        "size",
        "color",
        "hint",
        "hintColor",
        "Landroid/graphics/Typeface;",
        "defaultFont",
        "<init>",
        "(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)V",
        "Landroid/widget/TextView;",
        "textView",
        "Ll83/a0;",
        "apply",
        "(Landroid/widget/TextView;)V",
        "",
        "hasFont",
        "()Z",
        "colorOrNull",
        "()Ljava/lang/Integer;",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Landroid/graphics/Typeface;",
        "copy",
        "(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getFontResource",
        "Ljava/lang/String;",
        "getFontAssetsPath",
        "getStyle",
        "getSize",
        "getColor",
        "getHint",
        "getHintColor",
        "Landroid/graphics/Typeface;",
        "getDefaultFont",
        "getFont",
        "font",
        "Companion",
        "Builder",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lio/getstream/chat/android/ui/font/TextStyle$Companion;

.field public static final UNSET_COLOR:I = 0x7fffffff
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final UNSET_FONT_RESOURCE:I = -0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final UNSET_HINT:Ljava/lang/String; = ""
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final UNSET_HINT_COLOR:I = 0x7fffffff
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final UNSET_SIZE:I = -0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final color:I

.field private final defaultFont:Landroid/graphics/Typeface;

.field private final fontAssetsPath:Ljava/lang/String;

.field private final fontResource:I

.field private final hint:Ljava/lang/String;

.field private final hintColor:I

.field private final size:I

.field private final style:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/font/TextStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/font/TextStyle;->Companion:Lio/getstream/chat/android/ui/font/TextStyle$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lio/getstream/chat/android/ui/font/TextStyle;-><init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)V
    .locals 1

    const-string v0, "hint"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultFont"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    .line 5
    iput p3, p0, Lio/getstream/chat/android/ui/font/TextStyle;->style:I

    .line 6
    iput p4, p0, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    .line 7
    iput p5, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    .line 9
    iput p7, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    .line 10
    iput-object p8, p0, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, -0x1

    if-eqz p10, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    const v0, 0x7fffffff

    if-eqz p10, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    .line 11
    const-string p6, ""

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    .line 12
    sget-object p8, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const-string p9, "DEFAULT"

    invoke-static {p8, p9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    move-object p9, p8

    move p8, p7

    move-object p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p9}, Lio/getstream/chat/android/ui/font/TextStyle;-><init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/font/TextStyle;ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;ILjava/lang/Object;)Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/font/TextStyle;->style:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget p7, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    :cond_7
    move p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/chat/android/ui/font/TextStyle;->copy(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final apply(Landroid/widget/TextView;)V
    .locals 4

    const-string v0, "textView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getFonts()Lio/getstream/chat/android/ui/font/ChatFonts;

    move-result-object v0

    iget v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    int-to-float v1, v1

    invoke-virtual {p1, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_0
    iget v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    if-eq v1, v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setHintTextColor(I)V

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    invoke-interface {v0, p0, p1, v1}, Lio/getstream/chat/android/ui/font/ChatFonts;->setFont(Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    return-void
.end method

.method public final colorOrNull()Ljava/lang/Integer;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->style:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    return v0
.end method

.method public final component8()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 10

    const-string v0, "hint"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultFont"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/ui/font/TextStyle;-><init>(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/font/TextStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/font/TextStyle;

    iget v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    iget v3, p1, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->style:I

    iget v3, p1, Lio/getstream/chat/android/ui/font/TextStyle;->style:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    iget v3, p1, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    iget v3, p1, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    iget-object p1, p1, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    return v0
.end method

.method public final getDefaultFont()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final getFont()Landroid/graphics/Typeface;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getFonts()Lio/getstream/chat/android/ui/font/ChatFonts;

    move-result-object v0

    invoke-interface {v0, p0}, Lio/getstream/chat/android/ui/font/ChatFonts;->getFont(Lio/getstream/chat/android/ui/font/TextStyle;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public final getFontAssetsPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getFontResource()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    return v0
.end method

.method public final getHint()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    return-object v0
.end method

.method public final getHintColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    return v0
.end method

.method public final getSize()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    return v0
.end method

.method public final getStyle()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->style:I

    return v0
.end method

.method public final hasFont()Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    if-nez v0, :cond_1

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->style:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    invoke-virtual {v1}, Landroid/graphics/Typeface;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontResource:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/font/TextStyle;->fontAssetsPath:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/ui/font/TextStyle;->style:I

    iget v3, p0, Lio/getstream/chat/android/ui/font/TextStyle;->size:I

    iget v4, p0, Lio/getstream/chat/android/ui/font/TextStyle;->color:I

    iget-object v5, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hint:Ljava/lang/String;

    iget v6, p0, Lio/getstream/chat/android/ui/font/TextStyle;->hintColor:I

    iget-object v7, p0, Lio/getstream/chat/android/ui/font/TextStyle;->defaultFont:Landroid/graphics/Typeface;

    const-string v8, ", fontAssetsPath="

    const-string v9, ", style="

    const-string v10, "TextStyle(fontResource="

    invoke-static {v0, v10, v8, v1, v9}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", size="

    const-string v8, ", color="

    invoke-static {v0, v2, v1, v3, v8}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", hint="

    const-string v2, ", hintColor="

    invoke-static {v4, v1, v5, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", defaultFont="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lpr2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0080@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0080@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpr2/f;",
        "",
        "<init>",
        "()V",
        "Ll83/k;",
        "",
        "f",
        "()Ll83/k;",
        "",
        "firstName",
        "lastName",
        "Landroid/graphics/Bitmap;",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "bitmap",
        "",
        "c",
        "(Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/util/avatar/AvatarApi;",
        "avatarApi",
        "jpegBytes",
        "Lpr2/d;",
        "g",
        "(Lcom/whoop/util/avatar/AvatarApi;[BLq83/d;)Ljava/lang/Object;",
        "d",
        "(Lcom/whoop/util/avatar/AvatarApi;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "b",
        "Ltr2/n;",
        "logger",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lpr2/f;

.field private static final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpr2/f;

    invoke-direct {v0}, Lpr2/f;-><init>()V

    sput-object v0, Lpr2/f;->a:Lpr2/f;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AvatarUrlUtil"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lpr2/f;->b:Ltr2/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lpr2/f;)Ll83/k;
    .locals 0

    invoke-direct {p0}, Lpr2/f;->f()Ll83/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Ltr2/n;
    .locals 1

    sget-object v0, Lpr2/f;->b:Ltr2/n;

    return-object v0
.end method

.method private final f()Ll83/k;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/k;"
        }
    .end annotation

    new-instance v1, Ll83/k;

    const-string v0, "#42ABE7"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "#79FFD1"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v0, "#EBB681"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "#FF897A"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v0, "#D2FF8E"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "#FFF194"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "#A38EFF"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "#94A7FF"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "#B2FF8E"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "#94FFDF"

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v7, "#FF8EDB"

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "#FF9494"

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string v8, "#A88EFF"

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "#B529BA"

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string v9, "#FF652A"

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v10, "#FFD68E"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "#2B36FF"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-direct {v9, v0, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    const-string v0, "#81ECEC"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v11, "#00CEC9"

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-direct {v10, v0, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Ll83/k;

    const-string v0, "#8EC8FF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v12, "#FA94FF"

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct {v11, v0, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    const-string v0, "#FF875F"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v13, "#FF595C"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-direct {v12, v0, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Ll83/k;

    const-string v0, "#6485FF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v14, "#412CFF"

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-direct {v13, v0, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Ll83/k;

    const-string v0, "#864AFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v15, "#5500FF"

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-direct {v14, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Ll83/k;

    const-string v0, "#8EFFA6"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v16, "#3CECFF"

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v16

    move-object/from16 v17, v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v15, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v1, "#FF8ED0"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v16, "#C225D7"

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v16

    move-object/from16 v18, v2

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "#FFC38E"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v16, "#4934D3"

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v16

    move-object/from16 v19, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v2, "#8EB2FF"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v16, "#8833FF"

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v16

    move-object/from16 v20, v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "#FF8E8E"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v16, "#B2266A"

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v16

    move-object/from16 v21, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v2, "#FFCD7B"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v16, "#30E04E"

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v16

    move-object/from16 v22, v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "#48FF95"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v16, "#128A4A"

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v16

    move-object/from16 v23, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v18

    move-object/from16 v16, v19

    move-object/from16 v18, v21

    move-object/from16 v19, v22

    move-object/from16 v21, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v20

    move-object/from16 v20, v23

    filled-new-array/range {v1 .. v21}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v1, Lg93/d;->w:Lg93/c;

    invoke-static {v0}, Lm83/s;->i1(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    return-object v0
.end method


# virtual methods
.method public final c(Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lq83/d<",
            "-[B>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lpr2/f$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lpr2/f$a;-><init>(Landroid/graphics/Bitmap;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/whoop/util/avatar/AvatarApi;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/util/avatar/AvatarApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpr2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lpr2/f$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lpr2/f$b;

    iget v1, v0, Lpr2/f$b;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpr2/f$b;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpr2/f$b;

    invoke-direct {v0, p0, p4}, Lpr2/f$b;-><init>(Lpr2/f;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lpr2/f$b;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpr2/f$b;->H:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lpr2/f$b;->E:Ljava/lang/Object;

    check-cast p1, [B

    iget-object p1, v0, Lpr2/f$b;->z:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p1, v0, Lpr2/f$b;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lpr2/f$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lpr2/f$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/util/avatar/AvatarApi;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lpr2/f$b;->z:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p1, v0, Lpr2/f$b;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lpr2/f$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lpr2/f$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/util/avatar/AvatarApi;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lpr2/f$b;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lpr2/f$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lpr2/f$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/util/avatar/AvatarApi;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lpr2/f$b;->w:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->x:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->y:Ljava/lang/Object;

    iput v5, v0, Lpr2/f$b;->H:I

    invoke-virtual {p0, p2, p3, v0}, Lpr2/f;->e(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p4, Landroid/graphics/Bitmap;

    if-nez p4, :cond_6

    new-instance p1, Lpr2/d$a;

    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Failed to generate initials bitmap"

    invoke-direct {p2, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const-string p3, "Could not create avatar bitmap"

    invoke-direct {p1, p3, p2}, Lpr2/d$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    :cond_6
    iput-object p1, v0, Lpr2/f$b;->w:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->x:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->y:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->z:Ljava/lang/Object;

    iput v4, v0, Lpr2/f$b;->H:I

    invoke-virtual {p0, p4, v0}, Lpr2/f;->c(Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast p4, [B

    if-nez p4, :cond_8

    new-instance p1, Lpr2/d$a;

    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Failed to convert bitmap to JPEG"

    invoke-direct {p2, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const-string p3, "Could not convert avatar to JPEG"

    invoke-direct {p1, p3, p2}, Lpr2/d$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    :cond_8
    iput-object v6, v0, Lpr2/f$b;->w:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->x:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->y:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->z:Ljava/lang/Object;

    iput-object v6, v0, Lpr2/f$b;->E:Ljava/lang/Object;

    iput v3, v0, Lpr2/f$b;->H:I

    invoke-virtual {p0, p1, p4, v0}, Lpr2/f;->g(Lcom/whoop/util/avatar/AvatarApi;[BLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    return-object p1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-object v1

    :cond_1
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    new-instance v2, Lpr2/f$c;

    invoke-direct {v2, p1, p2, v1}, Lpr2/f$c;-><init>(Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v2, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/whoop/util/avatar/AvatarApi;[BLq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/util/avatar/AvatarApi;",
            "[B",
            "Lq83/d<",
            "-",
            "Lpr2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lpr2/f$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lpr2/f$d;

    iget v1, v0, Lpr2/f$d;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpr2/f$d;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lpr2/f$d;

    invoke-direct {v0, p0, p3}, Lpr2/f$d;-><init>(Lpr2/f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lpr2/f$d;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lpr2/f$d;->F:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lpr2/f$d;->y:Ljava/lang/Object;

    check-cast p1, Lud3/v0;

    iget-object p1, v6, Lpr2/f$d;->x:Ljava/lang/Object;

    check-cast p1, [B

    iget-object p1, v6, Lpr2/f$d;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/util/avatar/AvatarApi;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p3, Lud3/v0;->Companion:Lud3/u0;

    sget-object v1, Lud3/h0;->e:Lyb3/p;

    const-string v1, "image/jpeg"

    invoke-static {v1}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {p3, p2, v1, v3, v4}, Lud3/u0;->d(Lud3/u0;[BLud3/h0;II)Lud3/t0;

    move-result-object p2

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    sget-object v2, Lpr2/f;->b:Ltr2/n;

    new-instance v5, Lpr2/f$e;

    invoke-direct {v5, p1, p2, v9}, Lpr2/f$e;-><init>(Lcom/whoop/util/avatar/AvatarApi;Lud3/v0;Lq83/d;)V

    iput-object v9, v6, Lpr2/f$d;->w:Ljava/lang/Object;

    iput-object v9, v6, Lpr2/f$d;->x:Ljava/lang/Object;

    iput-object v9, v6, Lpr2/f$d;->y:Ljava/lang/Object;

    iput p3, v6, Lpr2/f$d;->F:I

    const/4 v3, 0x0

    const-string v4, "Failed to upload avatar"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_4

    new-instance p1, Lpr2/d$b;

    const-string p2, "Avatar uploaded successfully"

    invoke-direct {p1, p2}, Lpr2/d$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_4
    instance-of p1, p3, Lu02/a$b;

    if-eqz p1, :cond_5

    new-instance p1, Lpr2/d$a;

    check-cast p3, Lu02/a$b;

    invoke-virtual {p3}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    invoke-direct {p1, p2, v9, p3, v9}, Lpr2/d$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

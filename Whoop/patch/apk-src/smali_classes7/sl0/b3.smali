.class public final Lsl0/b3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0012\u00a8\u0006\u001a"
    }
    d2 = {
        "Lsl0/b3;",
        "",
        "",
        "totalLength",
        "window",
        "",
        "minAlpha",
        "Li2/x;",
        "color",
        "<init>",
        "(IIFJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "Ll3/d;",
        "builder",
        "",
        "text",
        "Ll83/a0;",
        "a",
        "(Ll3/d;Ljava/lang/String;)V",
        "I",
        "b",
        "c",
        "F",
        "d",
        "J",
        "e",
        "offset",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:F

.field private final d:J

.field private e:I


# direct methods
.method private constructor <init>(IIFJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lsl0/b3;->a:I

    .line 4
    iput p2, p0, Lsl0/b3;->b:I

    .line 5
    iput p3, p0, Lsl0/b3;->c:F

    .line 6
    iput-wide p4, p0, Lsl0/b3;->d:J

    return-void
.end method

.method public synthetic constructor <init>(IIFJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lsl0/b3;-><init>(IIFJ)V

    return-void
.end method


# virtual methods
.method public final a(Ll3/d;Ljava/lang/String;)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "builder"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "text"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual/range {p1 .. p2}, Ll3/d;->b(Ljava/lang/String;)V

    iget v4, v0, Lsl0/b3;->a:I

    iget v5, v0, Lsl0/b3;->b:I

    sub-int/2addr v4, v5

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    iget v7, v0, Lsl0/b3;->e:I

    add-int/2addr v7, v6

    if-lt v7, v4, :cond_0

    iget v8, v0, Lsl0/b3;->a:I

    add-int/lit8 v8, v8, -0x1

    sub-int/2addr v8, v7

    iget v7, v0, Lsl0/b3;->b:I

    iget v9, v0, Lsl0/b3;->c:F

    invoke-static {v8, v7, v9}, Lsl0/l2;->l0(IIF)F

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    cmpg-float v8, v7, v8

    if-gez v8, :cond_0

    new-instance v9, Ll3/m0;

    iget-wide v10, v0, Lsl0/b3;->d:J

    invoke-static {v7, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v10

    const/16 v27, 0x0

    const v28, 0xfffe

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v9 .. v28}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    add-int v7, v2, v6

    add-int/lit8 v8, v7, 0x1

    invoke-virtual {v1, v9, v7, v8}, Ll3/d;->a(Ll3/m0;II)V

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    iget v1, v0, Lsl0/b3;->e:I

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, v0, Lsl0/b3;->e:I

    return-void
.end method

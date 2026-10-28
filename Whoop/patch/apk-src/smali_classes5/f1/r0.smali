.class public final Lf1/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ly2/y;

.field public final d:Z

.field public final e:Lf1/u;

.field public final f:Lf1/u0;

.field public final g:La0/i0;

.field public final h:Ljava/util/ArrayList;

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>(JJLy2/y;ZLf1/u;Lf1/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf1/r0;->a:J

    iput-wide p3, p0, Lf1/r0;->b:J

    iput-object p5, p0, Lf1/r0;->c:Ly2/y;

    iput-boolean p6, p0, Lf1/r0;->d:Z

    iput-object p7, p0, Lf1/r0;->e:Lf1/u;

    iput-object p8, p0, Lf1/r0;->f:Lf1/u0;

    sget p1, La0/v;->a:I

    new-instance p1, La0/i0;

    const/4 p2, 0x6

    invoke-direct {p1, p2}, La0/i0;-><init>(I)V

    iput-object p1, p0, Lf1/r0;->g:La0/i0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lf1/r0;->h:Ljava/util/ArrayList;

    const/4 p1, -0x1

    iput p1, p0, Lf1/r0;->i:I

    iput p1, p0, Lf1/r0;->j:I

    iput p1, p0, Lf1/r0;->k:I

    return-void
.end method


# virtual methods
.method public final a(ILf1/h;Lf1/h;)I
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, Lf1/y0;->y(Lf1/h;Lf1/h;)Lf1/h;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    const/4 p3, 0x1

    if-eqz p2, :cond_3

    if-eq p2, p3, :cond_2

    const/4 p3, 0x2

    if-ne p2, p3, :cond_1

    :goto_0
    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget p1, p0, Lf1/r0;->k:I

    return p1

    :cond_3
    iget p1, p0, Lf1/r0;->k:I

    sub-int/2addr p1, p3

    return p1
.end method

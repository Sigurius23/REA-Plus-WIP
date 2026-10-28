.class public final Ld0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld0/f2;

.field public final b:Ljava/lang/Object;

.field public final c:J

.field public final d:Lc93/a;

.field public final e:Lp1/k1;

.field public f:Ld0/r;

.field public g:J

.field public h:J

.field public final i:Lp1/k1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ld0/f2;Ld0/r;JLjava/lang/Object;JLc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld0/k;->a:Ld0/f2;

    iput-object p6, p0, Ld0/k;->b:Ljava/lang/Object;

    iput-wide p7, p0, Ld0/k;->c:J

    iput-object p9, p0, Ld0/k;->d:Lc93/a;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/k;->e:Lp1/k1;

    invoke-static {p3}, Ld0/f;->l(Ld0/r;)Ld0/r;

    move-result-object p1

    iput-object p1, p0, Ld0/k;->f:Ld0/r;

    iput-wide p4, p0, Ld0/k;->g:J

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Ld0/k;->h:J

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/k;->i:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ld0/k;->i:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ld0/k;->d:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ld0/k;->a:Ld0/f2;

    iget-object v0, v0, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld0/k;->f:Ld0/r;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

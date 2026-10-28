.class public final Lu0/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll3/g;

.field public final b:Ll3/v0;

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:I

.field public final g:Ly3/c;

.field public final h:Lp3/h;

.field public final i:Ljava/util/List;

.field public j:Laa3/i1;

.field public k:Ly3/m;


# direct methods
.method public constructor <init>(Ll3/g;Ll3/v0;ZLy3/c;Lp3/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/c1;->a:Ll3/g;

    iput-object p2, p0, Lu0/c1;->b:Ll3/v0;

    const p1, 0x7fffffff

    iput p1, p0, Lu0/c1;->c:I

    const/4 p1, 0x1

    iput p1, p0, Lu0/c1;->d:I

    iput-boolean p3, p0, Lu0/c1;->e:Z

    iput p1, p0, Lu0/c1;->f:I

    iput-object p4, p0, Lu0/c1;->g:Ly3/c;

    iput-object p5, p0, Lu0/c1;->h:Lp3/h;

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lu0/c1;->i:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Ly3/m;)V
    .locals 7

    iget-object v0, p0, Lu0/c1;->j:Laa3/i1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lu0/c1;->k:Ly3/m;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, Laa3/i1;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iput-object p1, p0, Lu0/c1;->k:Ly3/m;

    iget-object v0, p0, Lu0/c1;->b:Ll3/v0;

    invoke-static {v0, p1}, Ljc/x;->p0(Ll3/v0;Ly3/m;)Ll3/v0;

    move-result-object v3

    new-instance v1, Laa3/i1;

    iget-object v2, p0, Lu0/c1;->a:Ll3/g;

    iget-object v4, p0, Lu0/c1;->i:Ljava/util/List;

    iget-object v5, p0, Lu0/c1;->g:Ly3/c;

    iget-object v6, p0, Lu0/c1;->h:Lp3/h;

    invoke-direct/range {v1 .. v6}, Laa3/i1;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;Ly3/c;Lp3/h;)V

    move-object v0, v1

    :cond_1
    iput-object v0, p0, Lu0/c1;->j:Laa3/i1;

    return-void
.end method

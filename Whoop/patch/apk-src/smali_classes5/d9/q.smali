.class public final Ld9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu8/p;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lv8/c;

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public constructor <init>(Lu8/p;IIIIIIILv8/c;ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/q;->a:Lu8/p;

    iput p2, p0, Ld9/q;->b:I

    iput p3, p0, Ld9/q;->c:I

    iput p4, p0, Ld9/q;->d:I

    iput p5, p0, Ld9/q;->e:I

    iput p6, p0, Ld9/q;->f:I

    iput p7, p0, Ld9/q;->g:I

    iput p8, p0, Ld9/q;->h:I

    iput-object p9, p0, Ld9/q;->i:Lv8/c;

    iput-boolean p10, p0, Ld9/q;->j:Z

    iput-boolean p11, p0, Ld9/q;->k:Z

    iput-boolean p12, p0, Ld9/q;->l:Z

    return-void
.end method


# virtual methods
.method public final a()Ld9/j;
    .locals 3

    new-instance v0, Ld9/j;

    iget v1, p0, Ld9/q;->c:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget v1, p0, Ld9/q;->g:I

    iput v1, v0, Ld9/j;->b:I

    iget v1, p0, Ld9/q;->e:I

    iput v1, v0, Ld9/j;->c:I

    iget v1, p0, Ld9/q;->f:I

    iput v1, v0, Ld9/j;->e:I

    iget-boolean v1, p0, Ld9/q;->l:Z

    iput-boolean v1, v0, Ld9/j;->a:Z

    iput-boolean v2, v0, Ld9/j;->d:Z

    iget v1, p0, Ld9/q;->h:I

    iput v1, v0, Ld9/j;->f:I

    return-object v0
.end method

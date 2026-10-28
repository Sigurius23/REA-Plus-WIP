.class public final Lnf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnf/e;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lnf/g;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lwe/o;)V
    .locals 3

    const-string v0, "awsSigner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln4/f;

    invoke-direct {v0}, Ln4/f;-><init>()V

    sget-object v1, Lwe/c;->w:Lwe/c;

    iput-object v1, v0, Ln4/f;->f:Ljava/io/Serializable;

    sget-object v1, Lwe/e;->x:Lwe/e;

    iput-object v1, v0, Ln4/f;->g:Ljava/io/Serializable;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ln4/f;->b:Z

    iput-boolean v1, v0, Ln4/f;->c:Z

    sget-object v1, Lwe/d;->w:Lwe/d;

    iput-object v1, v0, Ln4/f;->h:Ljava/lang/Object;

    new-instance v1, Lmd0/b;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lmd0/b;-><init>(I)V

    iput-object v1, v0, Ln4/f;->i:Ljava/lang/Object;

    iput-object p2, v0, Ln4/f;->d:Ljava/lang/Object;

    iput-object p1, v0, Ln4/f;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "aws.auth#sigv4"

    iput-object p1, p0, Lnf/j;->a:Ljava/lang/String;

    new-instance p1, Lnf/g;

    invoke-direct {p1, v0}, Lnf/g;-><init>(Ln4/f;)V

    iput-object p1, p0, Lnf/j;->b:Lnf/g;

    return-void
.end method


# virtual methods
.method public final b()Lnf/i;
    .locals 1

    iget-object v0, p0, Lnf/j;->b:Lnf/g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnf/j;->a:Ljava/lang/String;

    return-object v0
.end method

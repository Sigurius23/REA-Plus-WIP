.class public final Ldh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i;


# instance fields
.field public final a:Ldh/m;

.field public final b:Lmc3/i;


# direct methods
.method public constructor <init>(ILdh/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldh/c;->a:Ldh/m;

    invoke-static {p1}, Lmc3/j;->a(I)Lmc3/i;

    move-result-object p1

    iput-object p1, p0, Ldh/c;->b:Lmc3/i;

    return-void
.end method


# virtual methods
.method public final a(Lgh/n;Lmh/m;)Ldh/j;
    .locals 3

    new-instance v0, Ldh/e;

    iget-object p1, p1, Lgh/n;->a:Ldh/x;

    iget-object v1, p0, Ldh/c;->b:Lmc3/i;

    iget-object v2, p0, Ldh/c;->a:Ldh/m;

    invoke-direct {v0, p1, p2, v1, v2}, Ldh/e;-><init>(Ldh/x;Lmh/m;Lmc3/i;Ldh/m;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Ldh/c;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Ldh/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

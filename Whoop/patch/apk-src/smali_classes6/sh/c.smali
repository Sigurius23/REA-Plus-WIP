.class public final Lsh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/j;


# instance fields
.field public final a:Lmc3/i;

.field public final b:Lsh/n;


# direct methods
.method public constructor <init>(Lmc3/i;Lsh/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/c;->a:Lmc3/i;

    iput-object p2, p0, Lsh/c;->b:Lsh/n;

    return-void
.end method


# virtual methods
.method public final a(Luh/h;Lfi/o;)Lsh/k;
    .locals 3

    new-instance v0, Lsh/e;

    iget-object p1, p1, Luh/h;->a:Lsh/q;

    iget-object v1, p0, Lsh/c;->a:Lmc3/i;

    iget-object v2, p0, Lsh/c;->b:Lsh/n;

    invoke-direct {v0, p1, p2, v1, v2}, Lsh/e;-><init>(Lsh/q;Lfi/o;Lmc3/i;Lsh/n;)V

    return-object v0
.end method

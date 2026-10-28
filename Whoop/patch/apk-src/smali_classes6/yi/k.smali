.class public final Lyi/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:Lxi/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lxi/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lyi/k;->a:Lxi/f;

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    new-instance p2, Lsi/q;

    invoke-direct {p2, p1, p3, p0}, Lsi/q;-><init>(Lqi/w;Lzi/b;Lyi/k;)V

    return-object p2
.end method

.method public final b()Lxi/f;
    .locals 1

    iget-object v0, p0, Lyi/k;->a:Lxi/f;

    return-object v0
.end method

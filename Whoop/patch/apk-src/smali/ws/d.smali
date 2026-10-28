.class public final Lws/d;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lws/e;

.field public final c:Lro/i;


# direct methods
.method public constructor <init>(Lws/e;Lro/i;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lws/d;->b:Lws/e;

    iput-object p2, p0, Lws/d;->c:Lro/i;

    return-void
.end method


# virtual methods
.method public final X()Lgs/b;
    .locals 1

    iget-object v0, p0, Lws/d;->b:Lws/e;

    return-object v0
.end method

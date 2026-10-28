.class public final Lts/e;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lts/h;

.field public final c:Lro/i;


# direct methods
.method public constructor <init>(Lts/h;Lro/i;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lts/e;->b:Lts/h;

    iput-object p2, p0, Lts/e;->c:Lro/i;

    return-void
.end method


# virtual methods
.method public final z()Ljava/lang/Integer;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

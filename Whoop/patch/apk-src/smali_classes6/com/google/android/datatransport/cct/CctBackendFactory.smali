.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lhm/c;)Lhm/f;
    .locals 3

    new-instance v0, Lem/c;

    check-cast p1, Lhm/b;

    iget-object v1, p1, Lhm/b;->a:Landroid/content/Context;

    iget-object v2, p1, Lhm/b;->b:Lpm/a;

    iget-object p1, p1, Lhm/b;->c:Lpm/a;

    invoke-direct {v0, v1, v2, p1}, Lem/c;-><init>(Landroid/content/Context;Lpm/a;Lpm/a;)V

    return-object v0
.end method

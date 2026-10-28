.class public final Lys/a;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lys/d;

.field public final c:Lro/i;


# direct methods
.method public constructor <init>(Lys/d;Lro/i;)V
    .locals 1

    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lys/a;->b:Lys/d;

    iput-object p2, p0, Lys/a;->c:Lro/i;

    return-void
.end method

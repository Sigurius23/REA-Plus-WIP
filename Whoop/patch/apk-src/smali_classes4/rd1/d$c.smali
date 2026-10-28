.class Lrd1/d$c;
.super Lod1/t$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrd1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lrd1/d;


# direct methods
.method public synthetic constructor <init>(ILrd1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lrd1/d$c;-><init>(Lrd1/d;)V

    return-void
.end method

.method private constructor <init>(Lrd1/d;)V
    .locals 3

    .line 2
    iput-object p1, p0, Lrd1/d$c;->d:Lrd1/d;

    .line 3
    sget-object v0, Lrd1/d$k;->DISABLING:Lrd1/d$k;

    new-instance v1, Lrd1/d$c$a;

    invoke-direct {v1, p1}, Lrd1/d$c$a;-><init>(Lrd1/d;)V

    const/4 p1, 0x0

    const/4 v2, 0x5

    invoke-direct {p0, v0, v2, v1, p1}, Lod1/t$h;-><init>(Lod1/t$i;ILod1/t$a;Lod1/t$d;)V

    return-void
.end method

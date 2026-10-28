.class Lrd1/d$i;
.super Lod1/t$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrd1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field final synthetic d:Lrd1/d;


# direct methods
.method public synthetic constructor <init>(ILrd1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lrd1/d$i;-><init>(Lrd1/d;)V

    return-void
.end method

.method private constructor <init>(Lrd1/d;)V
    .locals 2

    .line 2
    iput-object p1, p0, Lrd1/d$i;->d:Lrd1/d;

    .line 3
    sget-object p1, Lrd1/d$k;->PRIMING:Lrd1/d$k;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1, v1}, Lod1/t$h;-><init>(Lod1/t$i;ILod1/t$a;Lod1/t$d;)V

    return-void
.end method

.class public final Lbm/u;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lbm/u;->w:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbm/t;

    iget v1, p0, Lbm/u;->w:I

    invoke-direct {v0, v1}, Lbm/t;-><init>(I)V

    return-object v0
.end method

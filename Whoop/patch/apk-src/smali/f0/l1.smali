.class public final synthetic Lf0/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf0/l1;->w:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lf0/r1;

    iget v1, p0, Lf0/l1;->w:I

    invoke-direct {v0, v1}, Lf0/r1;-><init>(I)V

    return-object v0
.end method

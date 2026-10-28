.class public final synthetic Lsm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llo/h;
.implements Llo/i;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lsm/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Llo/f;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lsm/b;->w:I

    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

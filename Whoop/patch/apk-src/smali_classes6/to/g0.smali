.class public final Lto/g0;
.super Lto/l;
.source "SourceFile"


# instance fields
.field public final synthetic c:Llo/r;


# direct methods
.method public constructor <init>(Llo/r;Lto/k;I)V
    .locals 0

    iput-object p1, p0, Lto/g0;->c:Llo/r;

    invoke-direct {p0, p2, p3}, Lto/l;-><init>(Lto/k;I)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/api/d;Lcq/i;)V
    .locals 1

    iget-object v0, p0, Lto/g0;->c:Llo/r;

    iget-object v0, v0, Llo/r;->y:Ljava/lang/Object;

    check-cast v0, La30/w0;

    invoke-virtual {v0, p1, p2}, La30/w0;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

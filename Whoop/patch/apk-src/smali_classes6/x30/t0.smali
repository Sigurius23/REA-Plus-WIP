.class public final Lx30/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb20/f;


# direct methods
.method public constructor <init>(Lb20/f;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx30/t0;->a:Lb20/f;

    return-void
.end method

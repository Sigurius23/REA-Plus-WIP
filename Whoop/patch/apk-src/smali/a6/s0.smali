.class public final La6/s0;
.super La6/e1;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "finalException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7fffffff

    invoke-direct {p0, v0}, La6/e1;-><init>(I)V

    iput-object p1, p0, La6/s0;->b:Ljava/lang/Throwable;

    return-void
.end method

.class public final La6/v0;
.super La6/e1;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(ILjava/lang/Throwable;)V
    .locals 1

    const-string v0, "readException"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La6/e1;-><init>(I)V

    iput-object p2, p0, La6/v0;->b:Ljava/lang/Throwable;

    return-void
.end method

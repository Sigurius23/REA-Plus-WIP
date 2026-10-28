.class public final Lh20/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh20/e;


# instance fields
.field public final a:Ljava/lang/Exception;

.field public final b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lh20/c;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lh20/c;->a:Ljava/lang/Exception;

    .line 4
    iput-object p2, p0, Lh20/c;->b:Ljava/lang/String;

    return-void
.end method

.class public final Lc/c;
.super Ljava/lang/IllegalStateException;
.source "SourceFile"


# instance fields
.field public final w:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lc/c;->w:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lc/c;->w:Ljava/lang/Exception;

    return-object v0
.end method

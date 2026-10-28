.class public final Lvb/e;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final w:Lvb/f;

.field public final x:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lvb/f;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lvb/e;->w:Lvb/f;

    iput-object p2, p0, Lvb/e;->x:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lvb/e;->x:Ljava/lang/Throwable;

    return-object v0
.end method

.class public final Lm5/q;
.super Le4/a;
.source "SourceFile"


# instance fields
.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm5/q;->f:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "password should not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm5/q;->f:Ljava/lang/String;

    return-object v0
.end method

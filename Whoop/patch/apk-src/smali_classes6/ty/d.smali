.class public abstract Lty/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lty/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltb0/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Ltb0/b;-><init>(I)V

    new-instance v1, Lty/c;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lty/c;-><init>(Ljava/lang/Object;I)V

    sput-object v1, Lty/d;->a:Lty/c;

    return-void
.end method

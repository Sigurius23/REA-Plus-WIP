.class public abstract Lny/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lx1/b;

    sget-object v1, Lny/a;->w:Lny/a;

    const/4 v2, 0x0

    const v3, -0x50b769a8

    invoke-direct {v0, v1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v0, Lny/b;->a:Lx1/b;

    return-void
.end method

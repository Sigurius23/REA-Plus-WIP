.class public abstract Lc4/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lc4/w;->x:Lc4/w;

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0xc869e20

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lc4/x;->a:Lx1/b;

    return-void
.end method

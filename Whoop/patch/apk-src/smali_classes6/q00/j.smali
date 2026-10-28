.class public abstract Lq00/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;

.field public static final b:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lx1/b;

    sget-object v1, Lq00/h;->w:Lq00/h;

    const/4 v2, 0x0

    const v3, 0x5258277f

    invoke-direct {v0, v1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v0, Lq00/j;->a:Lx1/b;

    new-instance v0, Lx1/b;

    sget-object v1, Lq00/i;->w:Lq00/i;

    const v3, 0x2583e6d5

    invoke-direct {v0, v1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v0, Lq00/j;->b:Lx1/b;

    return-void
.end method

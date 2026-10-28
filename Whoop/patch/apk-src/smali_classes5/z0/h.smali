.class public abstract Lz0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;

.field public static final b:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lz0/g;->y:Lz0/g;

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x25ecfd93

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lz0/h;->a:Lx1/b;

    sget-object v0, Lz0/g;->x:Lz0/g;

    new-instance v1, Lx1/b;

    const v3, -0x50ee6e26

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lz0/h;->b:Lx1/b;

    return-void
.end method

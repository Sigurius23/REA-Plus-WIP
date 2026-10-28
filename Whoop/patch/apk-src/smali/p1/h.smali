.class public abstract Lp1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;

.field public static final b:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lp1/g;->y:Lp1/g;

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x38ea4dba

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lp1/h;->a:Lx1/b;

    sget-object v0, Lp1/g;->x:Lp1/g;

    new-instance v1, Lx1/b;

    const v3, 0x72535ae8

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lp1/h;->b:Lx1/b;

    return-void
.end method

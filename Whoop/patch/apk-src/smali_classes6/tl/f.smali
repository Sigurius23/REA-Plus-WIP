.class public abstract Ltl/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc5/l;

.field public static final b:Ltl/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc5/l;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lc5/l;-><init>(I)V

    sput-object v0, Ltl/f;->a:Lc5/l;

    new-instance v0, Ltl/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ltl/f;->b:Ltl/e;

    return-void
.end method

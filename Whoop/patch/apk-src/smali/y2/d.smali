.class public abstract Ly2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly2/m;

.field public static final b:Ly2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly2/m;

    sget-object v1, Ly2/b;->w:Ly2/b;

    invoke-direct {v0, v1}, Ly2/a;-><init>(Lc93/m;)V

    sput-object v0, Ly2/d;->a:Ly2/m;

    new-instance v0, Ly2/m;

    sget-object v1, Ly2/c;->w:Ly2/c;

    invoke-direct {v0, v1}, Ly2/a;-><init>(Lc93/m;)V

    sput-object v0, Ly2/d;->b:Ly2/m;

    return-void
.end method

.class public abstract Lx63/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx63/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx63/a;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lx63/d;-><init>(I)V

    sput-object v0, Lx63/b;->a:Lx63/a;

    return-void
.end method

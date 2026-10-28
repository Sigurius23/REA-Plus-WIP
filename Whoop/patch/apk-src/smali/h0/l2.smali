.class public final Lh0/l2;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/p2;


# static fields
.field public static final P:Lqt/e;


# instance fields
.field public O:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt/e;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Lh0/l2;->P:Lqt/e;

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lh0/l2;->P:Lqt/e;

    return-object v0
.end method

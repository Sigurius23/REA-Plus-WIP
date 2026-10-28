.class public abstract Lw40/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lad3/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw01/e;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lw01/e;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lw40/b;->a:Lad3/r;

    return-void
.end method

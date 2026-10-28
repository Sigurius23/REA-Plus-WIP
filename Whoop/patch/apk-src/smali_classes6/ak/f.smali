.class public abstract Lak/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lak/e;->w:Lak/e;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lak/f;->a:Ll83/p;

    return-void
.end method

.method public static a()Lkotlin/jvm/functions/Function1;
    .locals 1

    sget-object v0, Lak/f;->a:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

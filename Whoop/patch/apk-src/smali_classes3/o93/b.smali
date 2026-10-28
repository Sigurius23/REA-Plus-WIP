.class public final Lo93/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lo93/b;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo93/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo93/b;->a:Lo93/b;

    sget-object v0, Ll83/i;->x:Ll83/i;

    sget-object v1, Lo93/a;->x:Lo93/a;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lo93/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a()Lo93/c;
    .locals 1

    sget-object v0, Lo93/b;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo93/c;

    return-object v0
.end method

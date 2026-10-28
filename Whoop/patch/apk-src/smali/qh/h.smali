.class public final synthetic Lqh/h;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lqh/h;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lqh/h;

    const-string v4, "currentTimeMillis()J"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Ljava/lang/System;

    const-string v3, "currentTimeMillis"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lqh/h;->w:Lqh/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

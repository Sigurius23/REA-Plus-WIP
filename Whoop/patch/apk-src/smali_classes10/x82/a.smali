.class public final Lx82/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lx82/a;",
        "Lof3/a;",
        "<init>",
        "()V",
        "",
        "using24HourTime",
        "Ll83/a0;",
        "c",
        "(Z)V",
        "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
        "w",
        "Ll83/h;",
        "a",
        "()Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
        "smartAlarmTriggerRepository",
        "Lcom/whoop/data/repositories/UserRepository;",
        "x",
        "b",
        "()Lcom/whoop/data/repositories/UserRepository;",
        "userRepository",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Ll83/h;

.field private final x:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lx82/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lx82/a$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lx82/a;->w:Ll83/h;

    new-instance v1, Lx82/a$b;

    invoke-direct {v1, p0, v2, v2}, Lx82/a$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lx82/a;->x:Ll83/h;

    return-void
.end method

.method private final a()Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;
    .locals 1

    iget-object v0, p0, Lx82/a;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    return-object v0
.end method

.method private final b()Lcom/whoop/data/repositories/UserRepository;
    .locals 1

    iget-object v0, p0, Lx82/a;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/UserRepository;

    return-object v0
.end method


# virtual methods
.method public final c(Z)V
    .locals 3

    invoke-direct {p0}, Lx82/a;->a()Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->onTimeZoneChanged()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lx82/a;->b()Lcom/whoop/data/repositories/UserRepository;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Lcom/whoop/data/repositories/UserRepository;->updateUserTimezonePreferences(ZLjava/lang/Long;)V

    return-void
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

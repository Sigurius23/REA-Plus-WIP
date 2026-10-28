.class public final synthetic Lsx1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lsx1/c;


# direct methods
.method public synthetic constructor <init>(Lsx1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsx1/d;->w:Lsx1/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsx1/d;->w:Lsx1/c;

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-static {v0, p1}, Lsx1/c$b;->f(Lsx1/c;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

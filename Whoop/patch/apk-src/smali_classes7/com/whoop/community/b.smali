.class public final synthetic Lcom/whoop/community/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lcom/whoop/community/CommunityFragment;

.field public final synthetic x:Lcom/whoop/domain/model/teams/Team;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/community/b;->w:Lcom/whoop/community/CommunityFragment;

    iput-object p2, p0, Lcom/whoop/community/b;->x:Lcom/whoop/domain/model/teams/Team;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/whoop/community/b;->w:Lcom/whoop/community/CommunityFragment;

    iget-object v1, p0, Lcom/whoop/community/b;->x:Lcom/whoop/domain/model/teams/Team;

    invoke-static {v0, v1, p1}, Lcom/whoop/community/CommunityFragment$d;->f(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

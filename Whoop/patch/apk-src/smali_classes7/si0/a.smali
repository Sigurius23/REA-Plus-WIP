.class public final Lsi0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J#\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lsi0/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/archv2/model/template/BackgroundModel;",
        "model",
        "Lti0/c;",
        "a",
        "(Lcom/whoop/archv2/model/template/BackgroundModel;)Lti0/c;",
        "",
        "imageUrl",
        "b",
        "(Lcom/whoop/archv2/model/template/BackgroundModel;Ljava/lang/String;)Lti0/c;",
        "arch-v2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lsi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsi0/a;

    invoke-direct {v0}, Lsi0/a;-><init>()V

    sput-object v0, Lsi0/a;->a:Lsi0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/archv2/model/template/BackgroundModel;)Lti0/c;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/BackgroundModel;->getUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_2

    invoke-static {v1}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    if-nez v1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/BackgroundModel;->getTheme()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    move-result-object v2

    if-nez v2, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/BackgroundModel;->getTheme()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lsi0/b;->a(Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;)Lti0/l;

    move-result-object p1

    if-eqz p1, :cond_5

    sget-object v2, Lti0/l;->DEFAULT:Lti0/l;

    if-ne p1, v2, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, p1

    :goto_2
    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    sget-object v0, Lti0/l;->DARK:Lti0/l;

    :goto_3
    new-instance p1, Lti0/c;

    invoke-direct {p1, v1, v0}, Lti0/c;-><init>(Lkd1/o;Lti0/l;)V

    return-object p1
.end method

.method public final b(Lcom/whoop/archv2/model/template/BackgroundModel;Ljava/lang/String;)Lti0/c;
    .locals 2

    invoke-virtual {p0, p1}, Lsi0/a;->a(Lcom/whoop/archv2/model/template/BackgroundModel;)Lti0/c;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lcom/whoop/archv2/model/template/BackgroundModel;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/whoop/archv2/model/template/BackgroundModel;-><init>(Ljava/lang/String;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lsi0/a;->a(Lcom/whoop/archv2/model/template/BackgroundModel;)Lti0/c;

    move-result-object p1

    :cond_0
    return-object p1
.end method

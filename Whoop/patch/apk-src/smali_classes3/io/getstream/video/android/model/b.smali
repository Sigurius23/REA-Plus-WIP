.class public final Lio/getstream/video/android/model/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;
    .locals 8

    const-string v0, "cid"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv8/b;->Y(Ljava/lang/String;)Ll83/k;

    move-result-object p0

    iget-object v0, p0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p0, p0, Ll83/k;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    new-instance v1, Lio/getstream/video/android/model/StreamCallId;

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lio/getstream/video/android/model/StreamCallId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lio/getstream/video/android/model/StreamCallId$$serializer;->INSTANCE:Lio/getstream/video/android/model/StreamCallId$$serializer;

    return-object v0
.end method
